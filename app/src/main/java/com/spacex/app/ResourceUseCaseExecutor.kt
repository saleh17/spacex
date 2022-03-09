package com.spacex.app

import androidx.lifecycle.MutableLiveData
import com.spacex.data.Resource

/**
 * Used to execute a [UseCase] and return the result in a [MutableLiveData] of type [Resource].
 */
open class ResourceUseCaseExecutor<T, in Params>(
    useCase: UseCase<T, Params>,
    params: Params,
    private val liveData: MutableLiveData<Resource<T>>,
    private val retryAction: (() -> Unit)? = null
) : UseCaseExecutor<T, Params>(useCase, params) {

    override fun preExecute() {
        liveData.value = Resource.Loading()
    }

    override fun getObserver(): DefaultObserver<T> {
        return object : DefaultObserver<T>() {
            override fun onNext(t: T) {
                liveData.value = Resource.Success(t)
                afterSuccess(t)
            }

            override fun onError(e: String) {
                liveData.value = Resource.Error(e,retryAction)
                afterError(e)
            }
        }
    }

    open fun afterSuccess(result: T) {
    }

    open fun afterError(e: String) {
    }
}
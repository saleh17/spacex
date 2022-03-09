package com.spacex.features.launches.domain

import com.spacex.app.ExecutionSchedulers
import com.spacex.app.UseCase
import com.spacex.data.api.RestApi
import com.spacex.data.model.Launch
import io.reactivex.Observable
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class GetLaunchesUseCase
@Inject constructor(
    private val restApi: RestApi,
    schedulers: ExecutionSchedulers
) : UseCase<List<Launch>, Unit>(schedulers) {

    override fun buildUseCaseObservable(params: Unit): Observable<List<Launch>> {
        val timeInMillis=Calendar.getInstance().timeInMillis
        return restApi.getLaunches().map {
            it.filter {launch->
                val time=launch.dateUnix?.times(1000L)
               val days= TimeUnit.MILLISECONDS.toDays(timeInMillis.minus(time?:0L))
                val checkValidity=days<3 * 365
                checkValidity
            }
        }
    }
}

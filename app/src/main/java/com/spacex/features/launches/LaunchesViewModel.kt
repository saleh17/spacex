package com.spacex.features.launches


import com.spacex.app.ResourceUseCaseExecutor
import com.spacex.data.Resource
import com.spacex.data.SingleLiveEvent
import com.spacex.data.model.Launch
import com.spacex.features.launches.domain.GetLaunchesUseCase
import com.spacex.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LaunchesViewModel
@Inject constructor(
    private val getLaunchesUseCase: GetLaunchesUseCase
) : BaseViewModel() {

    val launchesData = SingleLiveEvent<Resource<List<Launch>>>()

    fun getLaunches() {
        ResourceUseCaseExecutor(getLaunchesUseCase, Unit, launchesData){
            getLaunches()
        }.execute()
    }


    override fun onCleared() {
        super.onCleared()
        getLaunchesUseCase.dispose()
    }
}
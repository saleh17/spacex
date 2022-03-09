package com.spacex.features.rocket

import com.spacex.app.ResourceUseCaseExecutor
import com.spacex.data.Resource
import com.spacex.data.SingleLiveEvent
import com.spacex.data.model.Launch
import com.spacex.data.model.Rocket
import com.spacex.features.launches.domain.GetLaunchesUseCase
import com.spacex.features.rocket.domain.GetRocketUseCase
import com.spacex.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RocketDetailsViewModel
@Inject constructor(
    private val getRocketUseCase: GetRocketUseCase
) : BaseViewModel() {

    val rocketData = SingleLiveEvent<Resource<Rocket>>()

    fun getLaunches(id:String) {
        ResourceUseCaseExecutor(getRocketUseCase, id, rocketData){
            getLaunches(id)
        }.execute()
    }


    override fun onCleared() {
        super.onCleared()
        getRocketUseCase.dispose()
    }
}
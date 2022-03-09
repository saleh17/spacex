package com.spacex.features.rocket.domain

import com.spacex.app.ExecutionSchedulers
import com.spacex.app.UseCase
import com.spacex.data.api.RestApi
import com.spacex.data.model.Launch
import com.spacex.data.model.Rocket
import io.reactivex.Observable
import javax.inject.Inject

class GetRocketUseCase
@Inject constructor(
    private val restApi: RestApi,
    schedulers: ExecutionSchedulers
) : UseCase<Rocket, String>(schedulers) {

    override fun buildUseCaseObservable(id: String): Observable<Rocket> {
        return restApi.getRocketDetails(id)
    }
}

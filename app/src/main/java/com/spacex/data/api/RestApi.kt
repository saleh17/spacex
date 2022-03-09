package com.spacex.data.api

import com.spacex.data.model.Launch
import com.spacex.data.model.Rocket
import io.reactivex.Observable
import retrofit2.http.*

interface RestApi {

    @GET("launches")
    fun getLaunches(
    ): Observable<List<Launch>>

    @GET("rockets/{id}")
    fun getRocketDetails(
        @Path("id") id: String?
    ): Observable<Rocket>
}
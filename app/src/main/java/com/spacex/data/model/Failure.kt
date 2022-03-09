package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Failure(
      @field:[Expose SerializedName("altitude")]
    val altitude: Any?,
      @field:[Expose SerializedName("reason")]
    val reason: String?,
      @field:[Expose SerializedName("time")]
    val time: Int?
)
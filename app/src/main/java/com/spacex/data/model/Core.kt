package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Core(
      @field:[Expose SerializedName("core")]
    val core: String?,
      @field:[Expose SerializedName("flight")]
    val flight: Int?,
      @field:[Expose SerializedName("gridfins")]
    val gridfins: Boolean?,
      @field:[Expose SerializedName("landing_attempt")]
    val landingAttempt: Boolean?,
      @field:[Expose SerializedName("landing_success")]
    val landingSuccess: Any?,
      @field:[Expose SerializedName("landing_type")]
    val landingType: Any?,
      @field:[Expose SerializedName("landpad")]
    val landpad: Any?,
      @field:[Expose SerializedName("legs")]
    val legs: Boolean?,
      @field:[Expose SerializedName("reused")]
    val reused: Boolean?
)
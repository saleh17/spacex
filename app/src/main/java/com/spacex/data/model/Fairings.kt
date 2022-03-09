package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Fairings(
      @field:[Expose SerializedName("recovered")]
    val recovered: Boolean?,
      @field:[Expose SerializedName("recovery_attempt")]
    val recoveryAttempt: Boolean?,
      @field:[Expose SerializedName("reused")]
    val reused: Boolean?,
      @field:[Expose SerializedName("ships")]
    val ships: List<Any>?
)
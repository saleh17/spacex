package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Patch(
      @field:[Expose SerializedName("large")]
    val large: String?,
      @field:[Expose SerializedName("small")]
    val small: String?
)
package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Reddit(
      @field:[Expose SerializedName("campaign")]
    val campaign: Any?,
      @field:[Expose SerializedName("launch")]
    val launch: Any?,
      @field:[Expose SerializedName("media")]
    val media: Any?,
      @field:[Expose SerializedName("recovery")]
    val recovery: Any?
)
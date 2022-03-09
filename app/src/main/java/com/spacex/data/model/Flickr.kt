package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Flickr(
      @field:[Expose SerializedName("original")]
    val original: List<String>?,
      @field:[Expose SerializedName("small")]
    val small: List<String>?
)
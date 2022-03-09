package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Height(
      @field:[Expose SerializedName("feet")]
    val feet: Double?,
      @field:[Expose SerializedName("meters")]
    val meters: Double?
)
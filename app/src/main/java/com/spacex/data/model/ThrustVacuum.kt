package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ThrustVacuum(
      @field:[Expose SerializedName("kN")]
    val kN: Double?,
      @field:[Expose SerializedName("lbf")]
    val lbf: Double?
)
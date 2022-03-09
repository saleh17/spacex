package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompositeFairing(
      @field:[Expose SerializedName("diameter")]
    val diameter: Diameter?,
      @field:[Expose SerializedName("height")]
    val height: Height?
)
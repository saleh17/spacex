package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Mass(
      @field:[Expose SerializedName("kg")]
    val kg: Int?,
      @field:[Expose SerializedName("lb")]
    val lb: Int?
)
package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Payloads(
      @field:[Expose SerializedName("composite_fairing")]
    val compositeFairing: CompositeFairing?,
      @field:[Expose SerializedName("option_1")]
    val option1: String?
)
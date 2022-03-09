package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SecondStage(
      @field:[Expose SerializedName("burn_time_sec")]
    val burnTimeSec: Int?,
      @field:[Expose SerializedName("engines")]
    val engines: Int?,
      @field:[Expose SerializedName("fuel_amount_tons")]
    val fuelAmountTons: Double?,
      @field:[Expose SerializedName("payloads")]
    val payloads: Payloads?,
      @field:[Expose SerializedName("reusable")]
    val reusable: Boolean?,
      @field:[Expose SerializedName("thrust")]
    val thrust: Thrust?
)
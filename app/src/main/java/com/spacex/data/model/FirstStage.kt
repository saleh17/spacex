package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FirstStage(
      @field:[Expose SerializedName("burn_time_sec")]
    val burnTimeSec: Int?,
      @field:[Expose SerializedName("engines")]
    val engines: Int?,
      @field:[Expose SerializedName("fuel_amount_tons")]
    val fuelAmountTons: Double?,
      @field:[Expose SerializedName("reusable")]
    val reusable: Boolean?,
      @field:[Expose SerializedName("thrust_sea_level")]
    val thrustSeaLevel: ThrustSeaLevel?,
      @field:[Expose SerializedName("thrust_vacuum")]
    val thrustVacuum: ThrustVacuum?
)
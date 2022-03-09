package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Engines(
      @field:[Expose SerializedName("engine_loss_max")]
    val engineLossMax: Int?,
      @field:[Expose SerializedName("isp")]
    val isp: Isp?,
      @field:[Expose SerializedName("layout")]
    val layout: String?,
      @field:[Expose SerializedName("number")]
    val number: Int?,
      @field:[Expose SerializedName("propellant_1")]
    val propellant1: String?,
      @field:[Expose SerializedName("propellant_2")]
    val propellant2: String?,
      @field:[Expose SerializedName("thrust_sea_level")]
    val thrustSeaLevel: ThrustSeaLevel?,
      @field:[Expose SerializedName("thrust_to_weight")]
    val thrustToWeight: Double?,
      @field:[Expose SerializedName("thrust_vacuum")]
    val thrustVacuum: ThrustVacuum?,
      @field:[Expose SerializedName("type")]
    val type: String?,
      @field:[Expose SerializedName("version")]
    val version: String?
)
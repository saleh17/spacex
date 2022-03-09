package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Rocket(
      @field:[Expose SerializedName("active")]
    val active: Boolean?,
      @field:[Expose SerializedName("boosters")]
    val boosters: Int?,
      @field:[Expose SerializedName("company")]
    val company: String?,
      @field:[Expose SerializedName("cost_per_launch")]
    val costPerLaunch: Int?,
      @field:[Expose SerializedName("country")]
    val country: String?,
      @field:[Expose SerializedName("description")]
    val description: String?,
      @field:[Expose SerializedName("diameter")]
    val diameter: Diameter?,
      @field:[Expose SerializedName("engines")]
    val engines: Engines?,
      @field:[Expose SerializedName("first_flight")]
    val firstFlight: String?,
      @field:[Expose SerializedName("first_stage")]
    val firstStage: FirstStage?,
      @field:[Expose SerializedName("flickr_images")]
    val flickrImages: List<String>?,
      @field:[Expose SerializedName("height")]
    val height: Height?,
      @field:[Expose SerializedName("id")]
    val id: String?,
      @field:[Expose SerializedName("landing_legs")]
    val landingLegs: LandingLegs?,
      @field:[Expose SerializedName("mass")]
    val mass: Mass?,
      @field:[Expose SerializedName("name")]
    val name: String?,
      @field:[Expose SerializedName("payload_weights")]
    val payloadWeights: List<PayloadWeight>?,
      @field:[Expose SerializedName("second_stage")]
    val secondStage: SecondStage?,
      @field:[Expose SerializedName("stages")]
    val stages: Int?,
      @field:[Expose SerializedName("success_rate_pct")]
    val successRatePct: Int?,
      @field:[Expose SerializedName("type")]
    val type: String?,
      @field:[Expose SerializedName("wikipedia")]
    val wikipedia: String?
)
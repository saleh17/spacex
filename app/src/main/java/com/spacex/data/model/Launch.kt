package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Launch(
      @field:[Expose SerializedName("auto_update")]
    val autoUpdate: Boolean?,
      @field:[Expose SerializedName("capsules")]
    val capsules: List<Any>?,
      @field:[Expose SerializedName("cores")]
    val cores: List<Core>?,
      @field:[Expose SerializedName("crew")]
    val crew: List<Any>?,
      @field:[Expose SerializedName("date_local")]
    val dateLocal: String?,
      @field:[Expose SerializedName("date_precision")]
    val datePrecision: String?,
      @field:[Expose SerializedName("date_unix")]
    val dateUnix: Int?,
      @field:[Expose SerializedName("date_utc")]
    val dateUtc: String?,
      @field:[Expose SerializedName("details")]
    val details: String?,
      @field:[Expose SerializedName("failures")]
    val failures: List<Failure>?,
      @field:[Expose SerializedName("fairings")]
    val fairings: Fairings?,
      @field:[Expose SerializedName("flight_number")]
    val flightNumber: Int?,
      @field:[Expose SerializedName("id")]
    val id: String?,
      @field:[Expose SerializedName("launch_library_id")]
    val launchLibraryId: Any?,
      @field:[Expose SerializedName("launchpad")]
    val launchpad: String?,
      @field:[Expose SerializedName("links")]
    val links: Links?,
      @field:[Expose SerializedName("name")]
    val name: String?,
      @field:[Expose SerializedName("net")]
    val net: Boolean?,
      @field:[Expose SerializedName("payloads")]
    val payloads: List<String>?,
      @field:[Expose SerializedName("rocket")]
    val rocket: String?,
      @field:[Expose SerializedName("ships")]
    val ships: List<Any>?,
      @field:[Expose SerializedName("static_fire_date_unix")]
    val staticFireDateUnix: Int?,
      @field:[Expose SerializedName("static_fire_date_utc")]
    val staticFireDateUtc: String?,
      @field:[Expose SerializedName("success")]
    val success: Boolean?,
      @field:[Expose SerializedName("tbd")]
    val tbd: Boolean?,
      @field:[Expose SerializedName("upcoming")]
    val upcoming: Boolean?,
      @field:[Expose SerializedName("window")]
    val window: Int?
)
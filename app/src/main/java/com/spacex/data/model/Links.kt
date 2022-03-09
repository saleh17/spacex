package com.spacex.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Links(
      @field:[Expose SerializedName("article")]
    val article: String?,
      @field:[Expose SerializedName("flickr")]
    val flickr: Flickr?,
      @field:[Expose SerializedName("patch")]
    val patch: Patch?,
      @field:[Expose SerializedName("presskit")]
    val presskit: Any?,
      @field:[Expose SerializedName("reddit")]
    val reddit: Reddit?,
      @field:[Expose SerializedName("webcast")]
    val webcast: String?,
      @field:[Expose SerializedName("wikipedia")]
    val wikipedia: String?,
      @field:[Expose SerializedName("youtube_id")]
    val youtubeId: String?
)
package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LandingLegs(
      @field:[Expose SerializedName("number")]
    val number: Int?
) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readValue(Int::class.java.classLoader) as? Int) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(number)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LandingLegs> {
        override fun createFromParcel(parcel: Parcel): LandingLegs {
            return LandingLegs(parcel)
        }

        override fun newArray(size: Int): Array<LandingLegs?> {
            return arrayOfNulls(size)
        }
    }
}
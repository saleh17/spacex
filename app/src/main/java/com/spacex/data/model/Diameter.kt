package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Diameter(
      @field:[Expose SerializedName("feet")]
    val feet: Double?,
      @field:[Expose SerializedName("meters")]
    val meters: Double?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(feet)
        parcel.writeValue(meters)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Diameter> {
        override fun createFromParcel(parcel: Parcel): Diameter {
            return Diameter(parcel)
        }

        override fun newArray(size: Int): Array<Diameter?> {
            return arrayOfNulls(size)
        }
    }
}
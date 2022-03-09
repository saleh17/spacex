package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Isp(
      @field:[Expose SerializedName("sea_level")]
    val seaLevel: Int?,
      @field:[Expose SerializedName("vacuum")]
    val vacuum: Int?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(seaLevel)
        parcel.writeValue(vacuum)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Isp> {
        override fun createFromParcel(parcel: Parcel): Isp {
            return Isp(parcel)
        }

        override fun newArray(size: Int): Array<Isp?> {
            return arrayOfNulls(size)
        }
    }
}
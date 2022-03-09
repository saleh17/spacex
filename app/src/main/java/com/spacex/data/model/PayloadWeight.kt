package com.spacex.data.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PayloadWeight(
      @field:[Expose SerializedName("id")]
    val id: String?,
      @field:[Expose SerializedName("kg")]
    val kg: Int?,
      @field:[Expose SerializedName("lb")]
    val lb: Int?,
      @field:[Expose SerializedName("name")]
    val name: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeValue(kg)
        parcel.writeValue(lb)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PayloadWeight> {
        override fun createFromParcel(parcel: Parcel): PayloadWeight {
            return PayloadWeight(parcel)
        }

        override fun newArray(size: Int): Array<PayloadWeight?> {
            return arrayOfNulls(size)
        }
    }
}
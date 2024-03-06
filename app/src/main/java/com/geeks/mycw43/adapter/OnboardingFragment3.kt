package com.geeks.mycw43.adapter

import android.os.Parcel
import android.os.Parcelable

class OnboardingFragment3() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OnboardingFragment3> {
        override fun createFromParcel(parcel: Parcel): OnboardingFragment3 {
            return OnboardingFragment3(parcel)
        }

        override fun newArray(size: Int): Array<OnboardingFragment3?> {
            return arrayOfNulls(size)
        }
    }

}

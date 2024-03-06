package com.geeks.mycw43.adapter

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment

class OnboardingFragment1() : Fragment(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OnboardingFragment1> {
        override fun createFromParcel(parcel: Parcel): OnboardingFragment1 {
            return OnboardingFragment1(parcel)
        }

        override fun newArray(size: Int): Array<OnboardingFragment1?> {
            return arrayOfNulls(size)
        }
    }

}

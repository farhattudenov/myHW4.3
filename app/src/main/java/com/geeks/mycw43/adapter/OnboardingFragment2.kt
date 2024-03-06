package com.geeks.mycw43.adapter

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment

class OnboardingFragment2() : Fragment(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OnboardingFragment2> {
        override fun createFromParcel(parcel: Parcel): OnboardingFragment2 {
            return OnboardingFragment2(parcel)
        }

        override fun newArray(size: Int): Array<OnboardingFragment2?> {
            return arrayOfNulls(size)
        }
    }

}

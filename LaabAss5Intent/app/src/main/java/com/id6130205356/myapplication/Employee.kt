package com.id6130205356.myapplication

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Employee (var name:String, var gender:String, var email:String, var Salary:Int ) :
    Parcelable {
}
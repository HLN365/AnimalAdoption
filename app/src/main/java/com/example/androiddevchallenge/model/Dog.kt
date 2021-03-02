package com.example.androiddevchallenge.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dog(
    val name: String,
    val breed: String,
    val description: String,
    val location: String,
    @DrawableRes val picture: Int,
) : Parcelable

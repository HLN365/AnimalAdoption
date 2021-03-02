package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    val breed: String,
    val description: String,
    val location: String,
    @DrawableRes val picture: Int,
)

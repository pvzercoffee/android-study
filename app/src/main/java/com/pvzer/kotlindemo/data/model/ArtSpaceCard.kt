package com.pvzer.kotlindemo.data.model

import androidx.annotation.DrawableRes

data class ArtSpaceCard(
    @DrawableRes val image: Int,
    val description: String ,
    val title: String,
    val author: String,
    val year: String
)
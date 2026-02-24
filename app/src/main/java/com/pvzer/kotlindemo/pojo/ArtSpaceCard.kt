package com.pvzer.kotlindemo.pojo

import androidx.annotation.DrawableRes
import com.pvzer.kotlindemo.R

data class ArtSpaceCard(
    @DrawableRes val image: Int,
    val description: String ,
    val title: String,
    val author: String,
    val year: String
)
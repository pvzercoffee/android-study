package com.pvzer.kotlindemo.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Wellness(
    @StringRes val title:Int,
    @DrawableRes val image: Int,
    @StringRes val content: Int
)
package com.pvzer.kotlindemo.pojo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Wellness(
    @StringRes val title:Int,
    @DrawableRes val image: Int,
    @StringRes val content: Int
)
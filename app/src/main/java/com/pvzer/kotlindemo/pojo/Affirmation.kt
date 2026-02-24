package com.pvzer.kotlindemo.pojo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.pvzer.kotlindemo.R


data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
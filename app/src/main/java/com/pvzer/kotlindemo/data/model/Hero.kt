package com.pvzer.kotlindemo.data.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
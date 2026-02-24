package com.pvzer.kotlindemo.pojo;

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.pvzer.kotlindemo.R;

data class Topic(
    @StringRes val name: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageRes: Int
)
package com.pvzer.kotlindemo.pojo

import androidx.annotation.DrawableRes
import com.pvzer.kotlindemo.R

class ArtSpaceCard(
    @DrawableRes val image: Int,
    val description: String ,
    val title: String,
    val author: String,
    val year: String
){

    companion object {
        fun loadCard():List<ArtSpaceCard>{
            return listOf<ArtSpaceCard>(
                ArtSpaceCard(
                    image = R.drawable.landspace_qixingyan,
                    description = "七星岩风景",
                    title = "端州区七星岩的公园风景",
                    author = "PvZer Coffee",
                    year = "2025"),
                ArtSpaceCard(
                    image = R.drawable.landspace_duanzhou,
                    description = "端州区风景",
                    title = "端州区黄冈街道的黄昏时",
                    author = "PvZer Coffee",
                    year = "2026"
                ),
                ArtSpaceCard(
                    image = R.drawable.landspace_shenguangshan,
                    description = "神光山风景",
                    title = "兴宁市神光山顶的日落",
                    author = "PvZer Coffee",
                    year = "2026"
                )
            )
        }
    }

}
package com.pvzer.kotlindemo.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pvzer.kotlindemo.R

@Composable
private fun GreetingText(message: String, from:String, modifier: Modifier = Modifier){

    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = message,
            modifier = Modifier,
            fontSize = 70.sp,
            lineHeight = 96.sp,
            textAlign = TextAlign.Center,
            color = Color.DarkGray
        )

        Text(
            text = "from $from",
            fontSize = 40.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }

}

@Composable
fun BirthdayCardDemo(message: String, from : String, modifier: Modifier  = Modifier) {
    val image = painterResource(R.drawable.androidparty)

    Box(modifier) {

        Image(
            painter = image,
            contentDescription = "贺卡图片",
            contentScale = ContentScale.Crop,
            alpha = 1f
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
        )

    }
}
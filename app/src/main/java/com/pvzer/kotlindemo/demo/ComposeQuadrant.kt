package com.pvzer.kotlindemo.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pvzer.kotlindemo.R
import org.intellij.lang.annotations.JdkConstants


@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()

    ){
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.limit_1_title),
                message = stringResource(R.string.limit_1_message),
                background = colorResource(R.color.limit_1),
                modifier = Modifier.weight(1f)

            )

            QuadrantCard(
                title = stringResource(R.string.limit_2_title),
                message = stringResource(R.string.limit_2_message),
                background = colorResource(R.color.limit_2),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.limit_3_title),
                message = stringResource(R.string.limit_3_message),
                background = colorResource(R.color.limit_3),
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                title = stringResource(R.string.limit_4_title),
                message = stringResource(R.string.limit_4_message),
                background = colorResource(R.color.limit_4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun QuadrantCard(
    title: String,
    message: String,
    background: Color,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier
        .fillMaxSize()
        .background(background)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ){
        Text(
            fontSize = 16.sp,
            fontWeight = FontWeight.W900,
            text = title,
        )
        Text(
            text = message,
            modifier = Modifier.padding(top = 16.dp),
        )
    }
}


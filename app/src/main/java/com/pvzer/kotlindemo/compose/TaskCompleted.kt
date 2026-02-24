package com.pvzer.kotlindemo.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pvzer.kotlindemo.R

@Composable
fun TaskCompletedScreen(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    val message = stringResource(R.string.all_tasks_completed)
    val say = stringResource(R.string.nice_work)

    TaskCompleted(
        image,message,say,modifier
    )
}

@Composable
private fun TaskCompleted(
    image: Painter,
    message: String,
    say: String,
    modifier: Modifier
){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = message,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 24.dp , bottom = 8.dp)
                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = say,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}


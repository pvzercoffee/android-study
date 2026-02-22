package com.pvzer.kotlindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pvzer.kotlindemo.ui.theme.KotlinDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinDemoTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(0.dp, 50.dp),
                    color = MaterialTheme.colorScheme.background,
                    ) {

                    GreetingImage("Happy Birthday Catus1437!","PvZer")

                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from:String, modifier: Modifier = Modifier){

    Column(
        modifier = modifier,
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
            modifier = Modifier.padding(16.dp).align(alignment = Alignment.End)
        )

    }

}

@Composable
fun GreetingImage(message: String, from : String,modifier: Modifier  = Modifier){
    val image = painterResource(R.drawable.androidparty)

    Box(modifier) {

        Image(
            painter = image,
            contentDescription = "贺卡图片",
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )
        GreetingText(
            message = message,
            from =from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
        )

    }


}

@Preview
@Composable
fun greetingTextPreview(){
    GreetingText(message = "Happy Birthday! Sam","pvzercoffee")
    GreetingImage(message = "Happy Birthday! Sam","pvzercoffee")
}
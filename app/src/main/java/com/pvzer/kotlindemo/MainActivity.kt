package com.pvzer.kotlindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pvzer.kotlindemo.demo.ComposeArticleDemo
import com.pvzer.kotlindemo.demo.BirthdayCardDemo
import com.pvzer.kotlindemo.demo.TaskCompletedDemo
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

                    BirthyCardScreen();
//                    ComposeArticleScreen()
//                    TaskCompletedDemo()

                }
            }
        }
    }
}

@Composable
fun BirthyCardScreen(){
    val happyBirthday = stringResource(R.string.happy_birthday);
    val targetName = stringResource(R.string.card_target_name);
    val pvzer = stringResource(R.string.pvzer);

    BirthdayCardDemo("$happyBirthday $targetName", pvzer)
}

@Composable
fun ComposeArticleScreen(){
    ComposeArticleDemo(
        image = painterResource(R.drawable.compose_article_head),
        title = stringResource(R.string.compose_article_title),
        abstract = stringResource(R.string.compose_article_abstract),
        text = stringResource(R.string.compose_article_text),
    )
}

@Composable
fun TaskCompletedScreen(){
    TaskCompletedDemo()
}
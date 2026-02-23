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
import com.pvzer.kotlindemo.compose.ComposeArticleDemo
import com.pvzer.kotlindemo.compose.BirthdayCardDemo
import com.pvzer.kotlindemo.compose.BusinessCardDemo
import com.pvzer.kotlindemo.compose.ComposeQuadrant
import com.pvzer.kotlindemo.compose.DiceRollerDemo
import com.pvzer.kotlindemo.compose.TaskCompletedDemo
import com.pvzer.kotlindemo.compose.TipCalculatorDemo
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

//                    BirthyCardScreen()
//                    ComposeArticleScreen()
//                    TaskCompletedDemo()
//                    ComposeQuadrant()
//                    BusinessCardScreen()
//                    DiceRollerDemo();
                    TipCalculatorDemo()

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

@Composable
fun ComposeQuadrantScreen(){
    ComposeQuadrant();
}

@Composable
fun BusinessCardScreen(){
    val name = stringResource(R.string.business_card_name)
    val introduction = stringResource(R.string.business_card_introduction)
    val phone = stringResource(R.string.business_card_phone)
    val site = stringResource(R.string.business_card_site)
    val email = stringResource(R.string.business_card_email)
    val avatar = painterResource(R.drawable.business_card_avatar)

    BusinessCardDemo(name, introduction, phone, site, email,avatar)
}

@Composable
fun DiceRollerScreen() {
    DiceRollerDemo()
}

@Composable
fun TipCalculatorScreen() {
    TipCalculatorDemo()
}
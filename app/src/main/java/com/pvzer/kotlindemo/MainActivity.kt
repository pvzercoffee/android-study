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
import com.pvzer.kotlindemo.compose.ArtSpaceDemo
import com.pvzer.kotlindemo.compose.ComposeArticleDemo
import com.pvzer.kotlindemo.compose.BirthdayCardDemo
import com.pvzer.kotlindemo.compose.BusinessCardDemo
import com.pvzer.kotlindemo.compose.ComposeQuadrantScreen
import com.pvzer.kotlindemo.compose.DiceRollerDemo
import com.pvzer.kotlindemo.compose.TaskCompletedScreen
import com.pvzer.kotlindemo.compose.TipCalculatorDemo
import com.pvzer.kotlindemo.pojo.ArtSpaceCard
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
//                    TaskCompletedScreen()
//                    ComposeQuadrantScreen()
//                    BusinessCardScreen()
//                    DiceRollerScreen()
//                    TipCalculatorScreen()
                    ArtSpaceScreen()

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
    TaskCompletedScreen()
}

@Composable
fun ComposeQuadrantScreen(){
    ComposeQuadrantScreen();
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

@Composable
fun ArtSpaceScreen(){

    var cardList: ArrayList<ArtSpaceCard> = ArrayList()

    cardList.add(ArtSpaceCard(
        image = R.drawable.landspace_qixingyan,
        description = "七星岩风景",
        title = "端州区七星岩的公园风景",
        author = "PvZer Coffee",
        year = "2025"
    ))

    cardList.add(ArtSpaceCard(
        image = R.drawable.landspace_duanzhou,
        description = "端州区风景",
        title = "端州区黄冈街道的黄昏时",
        author = "PvZer Coffee",
        year = "2026"
    ))

    cardList.add(ArtSpaceCard(
        image = R.drawable.landspace_shenguangshan,
        description = "神光山风景",
        title = "兴宁市神光山顶的日落",
        author = "PvZer Coffee",
        year = "2026"
    ))

    ArtSpaceDemo(cardList)
}
package com.pvzer.kotlindemo

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.pvzer.kotlindemo.ui.affirmation.AffirmationsDemo
import com.pvzer.kotlindemo.ui.art_space.ArtSpaceDemo
import com.pvzer.kotlindemo.ui.compose_article.ComposeArticleDemo
import com.pvzer.kotlindemo.ui.birthday_card.BirthdayCardDemo
import com.pvzer.kotlindemo.ui.business_card.BusinessCardDemo
import com.pvzer.kotlindemo.ui.quadrant.ComposeQuadrantScreen
import com.pvzer.kotlindemo.ui.courses.CoursesDemo
import com.pvzer.kotlindemo.ui.dice_roller.DiceRollerDemo
import com.pvzer.kotlindemo.ui.unscramble.GameScreen
import com.pvzer.kotlindemo.ui.superhero.SuperheroDemo
import com.pvzer.kotlindemo.ui.task_completed.TaskCompletedDemo
import com.pvzer.kotlindemo.ui.tip_calculator.TipCalculatorDemo
import com.pvzer.kotlindemo.ui.wellness.WellnessDemo
import com.pvzer.kotlindemo.ui.woof.WoofDemo
import com.pvzer.kotlindemo.data.local.DataSource
import com.pvzer.kotlindemo.data.local.art_space.ArtSpaceDatasource
import com.pvzer.kotlindemo.data.local.dessert.DessertDatasource
import com.pvzer.kotlindemo.ui.dessert.DessertClickerApp
import com.pvzer.kotlindemo.ui.theme.SuperheroesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            SuperheroesTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {

//                    BirthyCardScreen()
//                    ComposeArticleScreen()
//                    TaskCompletedScreen()
//                    ComposeQuadrantScreen()
//                    BusinessCardScreen()
//                    DiceRollerScreen()
//                    TipCalculatorScreen()
//                    ArtSpaceScreen()
//                    AffirmationsDemo()
//                    CoursesDemo()
//                    WoofScreen()
//                    SuperheroScreen()
//                    WellnessScreen()
//                    UnscrambleScreen()
                    DessertScreen()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
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
    ArtSpaceDemo(ArtSpaceDatasource.artCardList)
}

@Composable
fun AffirmationsScreen(){
    AffirmationsDemo()
}

@Composable
fun CoursesScreen(){
    CoursesDemo()
}

@Composable
fun WoofScreen(){
    WoofDemo()
}

@Composable
fun SuperheroScreen(){
    SuperheroDemo()
}

@Composable
fun WellnessScreen(){
    WellnessDemo()
}

@Composable
fun UnscrambleScreen(){
    GameScreen()
}

@Composable
fun DessertScreen(){
    DessertClickerApp(desserts = DessertDatasource.dessertList)
}
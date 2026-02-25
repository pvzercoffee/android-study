package com.pvzer.kotlindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pvzer.kotlindemo.compose.AffirmationsDemo
import com.pvzer.kotlindemo.compose.ArtSpaceDemo
import com.pvzer.kotlindemo.compose.ComposeArticleDemo
import com.pvzer.kotlindemo.compose.BirthdayCardDemo
import com.pvzer.kotlindemo.compose.BusinessCardDemo
import com.pvzer.kotlindemo.compose.ComposeQuadrantScreen
import com.pvzer.kotlindemo.compose.CoursesDemo
import com.pvzer.kotlindemo.compose.DiceRollerDemo
import com.pvzer.kotlindemo.compose.DogItem
import com.pvzer.kotlindemo.compose.TaskCompletedDemo
import com.pvzer.kotlindemo.compose.TipCalculatorDemo
import com.pvzer.kotlindemo.compose.WoofDemo
import com.pvzer.kotlindemo.constant.DataSource
import com.pvzer.kotlindemo.pojo.ArtSpaceCard
import com.pvzer.kotlindemo.pojo.dogs
import com.pvzer.kotlindemo.ui.theme.WoofTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            WoofTheme {
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
                    WoofScreen()
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun WoofTopAppBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.image_size))
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    painter = painterResource(R.drawable.memory),

                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
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
    ArtSpaceDemo(DataSource.artCardList)
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

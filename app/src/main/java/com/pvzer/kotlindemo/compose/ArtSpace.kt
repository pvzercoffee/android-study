package com.pvzer.kotlindemo.compose


import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pvzer.kotlindemo.R
import com.pvzer.kotlindemo.pojo.ArtSpaceCard

@Composable
fun ArtSpaceDemo(
    cardList: List<ArtSpaceCard> = emptyList(),
    modifier: Modifier = Modifier
){
    if(cardList.isEmpty()){
        Text("网络异常，请稍后再试")
        return;
    }

    var currentIndex by remember { mutableStateOf<Int>(0) }
    val currentCard = cardList[currentIndex]

    Column(modifier = modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {

        Spacer(modifier = Modifier.height(30.dp))

        PhotoSpace(
            image = currentCard.image,
            description = currentCard.description
        )

        Spacer(modifier = Modifier.height(30.dp))

        TitleSpace(
            title = currentCard.title,
            author = currentCard.author,
            year = currentCard.year
        )

        Spacer(modifier = Modifier.weight(0.5f))

        ButtonSpace(
            onNextClick = {
                currentIndex = ( currentIndex + 1 ) % cardList.size
            },
            onPreviousClick = {
                currentIndex = (currentIndex - 1 + cardList.size) % cardList.size
            }
        )
    }
}

@Composable
private fun PhotoSpace(
    @DrawableRes image: Int,
    description: String = "",
    modifier: Modifier = Modifier
    ){
    Image(
        painter = painterResource(image),
        contentDescription = description,
        modifier = modifier
            .shadow(15.dp)
            .background(MaterialTheme.colorScheme.surface)
            .padding(32.dp)
            .fillMaxWidth(0.8f)
            .fillMaxHeight(0.5f)
    )
}

@Composable
private fun TitleSpace(
    title: String,
    author: String,
    year: String,
    modifier: Modifier = Modifier
){

    Column(modifier = modifier
        .padding(horizontal = 40.dp)
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.surfaceContainerHigh),
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.W300,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp,top = 15.dp),
            textAlign = TextAlign.Left
        )
        Row(modifier = Modifier
            .padding(start = 15.dp)
            .padding(vertical = 10.dp)) {
            Text(
                text = author,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.W700,
            )
            Text(
                text = "($year)",
                style = MaterialTheme.typography.bodyLarge
            )
        }


    }
}

@Composable
fun ButtonSpace(
    modifier: Modifier = Modifier,
    onPreviousClick:() -> Unit = {},
    onNextClick:() -> Unit = {},
    ){
    Row(modifier = modifier.
    fillMaxWidth().
    padding(25.dp),
        horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
        Button(
            onClick =onPreviousClick,
            modifier = Modifier.width(120.dp),
        ){
            Text(
                text = stringResource(R.string.art_previous),
            )
        }

        Button(
            onClick = onNextClick,
            modifier = Modifier.width(120.dp),
        ){
            Text(stringResource(R.string.art_next))
        }
    }
}
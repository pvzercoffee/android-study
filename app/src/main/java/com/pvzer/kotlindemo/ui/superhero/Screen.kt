package com.pvzer.kotlindemo.ui.superhero

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pvzer.kotlindemo.R
import com.pvzer.kotlindemo.data.local.superhero.SuperheroDatasource
import com.pvzer.kotlindemo.model.Hero

@Composable
@Preview
fun SuperheroDemo(modifier: Modifier = Modifier){
    val heroList = SuperheroDatasource.heroes

    Scaffold(
        topBar = {
            TopBar()
        }
    ) {
        it ->
        LazyColumn(contentPadding = it) {
            items(heroList){
                hero -> SuperHeroItem(hero)
            }
        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(modifier = Modifier) {
                Text(
                    text = stringResource(R.string.superheros),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
        ,modifier = modifier
    )
}

@Composable
public fun SuperHeroItem(hero: Hero,modifier: Modifier = Modifier){


    Card(modifier = modifier.padding(dimensionResource(R.dimen.padding_small))) {
        Row(modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_medium))
            .fillMaxWidth()) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(hero.nameRes),
                    style = MaterialTheme.typography.displaySmall,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = stringResource(hero.descriptionRes),
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            Image(
                painter = painterResource(hero.imageRes),
                contentDescription = stringResource(hero.nameRes),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(dimensionResource(R.dimen.padding_small)))
            )
        }
    }
}
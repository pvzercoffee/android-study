package com.pvzer.kotlindemo.compose

import android.widget.ImageButton
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.pvzer.kotlindemo.R
import com.pvzer.kotlindemo.constant.DataSource
import com.pvzer.kotlindemo.pojo.Wellness

@Composable
fun WellnessDemo(){

    val wellnessList = DataSource.WellnessList

    Scaffold(
        topBar = {
            TopBar()
        }
    ) {
        it ->
        LazyColumn(contentPadding = it) {
            itemsIndexed(wellnessList){
                index,wellness ->
                val dayNumber = index+1

                WellnessCard(wellness,dayNumber)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row {
                Text(
                    text = stringResource(R.string._30_days_of_wellness)
                )
            }
        },modifier = modifier
    )
}


@Composable
private fun WellnessItemButton(
    expanded: Boolean,
    onClick:() ->Unit,
    modifier: Modifier = Modifier
){
    IconButton(
        onClick = onClick,
        modifier = modifier
    ){
        Icon(
            imageVector = if(expanded)Icons.Filled.ExpandMore else Icons.Filled.ExpandLess,
            contentDescription = stringResource(R.string.click_to_expand),
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
private fun WellnessCard(wellness: Wellness,index:Int = 1,modifier: Modifier = Modifier
    .padding(dimensionResource(R.dimen.padding_small))){

    var expanded by remember{ mutableStateOf(false) };

    Card(modifier = modifier){
        Column(modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_medium))
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            )
            .fillMaxWidth()
        ){
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Day$index",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.weight(1f),
                )

                WellnessItemButton(expanded,{expanded = !expanded})
            }
            Text(
                text = stringResource(wellness.title),
                style = MaterialTheme.typography.displaySmall
            )

            if(expanded){
                Image(
                    painter = painterResource(wellness.image),
                    contentDescription = stringResource(wellness.title),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                        .padding(vertical = dimensionResource(R.dimen.padding_small))
                )

                Text(
                    text = stringResource(wellness.content),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}
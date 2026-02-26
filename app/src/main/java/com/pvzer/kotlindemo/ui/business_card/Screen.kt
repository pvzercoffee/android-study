package com.pvzer.kotlindemo.ui.business_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pvzer.kotlindemo.R

@Composable
fun BusinessCardDemo(
    name:String,
    introduction: String,
    phone: String,
    site: String,
    email: String,
    avatar: Painter,
    modifier: Modifier = Modifier
){
    val backgroundColor = colorResource(R.color.business_card_background)

    Column(modifier = modifier
        .fillMaxSize()
        .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        val textColor = colorResource(R.color.business_card_text)

        Box(contentAlignment = Alignment.Center,modifier = modifier.weight(1f)){
            CardCenter(avatar, name, introduction,textColor,modifier)
        }
        CardBottom(phone,site,email,modifier.padding(top = 100.dp).offset(y = -50.dp))
    }

}

@Composable
private fun CardCenter(
    avatar: Painter,
    name:String,
    introduction: String,
    textColor: Color,
    modifier: Modifier

){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = avatar,
            contentDescription = "头像",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 50.sp,
            fontWeight = FontWeight.Thin
        )
        Text(
            text = introduction,
            color = textColor,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W900,
            modifier = modifier.padding(top = 15.dp)
        )
    }
}

@Composable
private fun CardBottom(
    phone: String,
    site: String,
    email: String,
    modifier: Modifier = Modifier
){
    Column(modifier.padding(top = 50.dp)) {

        DetailItem(
            icon = painterResource(R.drawable.baseline_phone_24),
            message = phone
        )
        DetailItem(
            icon = painterResource(R.drawable.baseline_share_24),
            message = site
        )
        DetailItem(
            icon = painterResource(R.drawable.baseline_email_24),
            message = email
        )

    }
}

@Composable
private fun DetailItem(icon: Painter, message: String, modifier: Modifier = Modifier){
    Row(modifier.padding(top = 15.dp)) {
        Image(
            painter = icon,
            contentDescription = "",
            Modifier.scale(1f)
                .padding(end = 15.dp)
        )
        Text(
            text = message,
            fontSize = 18.sp,
            fontWeight = FontWeight.W500
        )
    }
}
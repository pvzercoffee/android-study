package com.pvzer.kotlindemo.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposeArticleDemo(
    image: Painter,
    title:String,
    abstract:String,
    text:String,
    modifier: Modifier = Modifier
){

    Column() {
        ArticleHead(image)
        ArticleContent(title,abstract,text,modifier)
    }
}

@Composable
private fun ArticleHead(image: Painter){

    Image(
        painter = image,
        contentDescription = "文章顶部图片"
    )
}

@Composable
private fun ArticleContent(title:String, abstract: String, text: String,modifier: Modifier){
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = abstract,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
            lineHeight = 23.sp
        )
        Text(
            text = text,
            modifier = modifier.padding(16.dp),
            lineHeight = 23.sp,
            textAlign = TextAlign.Justify
        )
    }
}
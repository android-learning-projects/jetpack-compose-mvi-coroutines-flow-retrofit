package com.example.users.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoadingWidget(){
    Box(modifier = Modifier.fillMaxSize(),){
        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
    }
}


@Preview
@Composable
fun LoadingWidgetPreview(){
    LoadingWidget()
}

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
fun ErrorWidget(error: String){
    Box(modifier = Modifier.fillMaxSize(),){
        Text(text = error, modifier = Modifier.align(Alignment.Center),
        style = MaterialTheme.typography.h6.copy(color = Color.Red))
    }
}


@Preview
@Composable
fun ErrorWidgetPreview(){
    ErrorWidget("Check your internet connection")
}

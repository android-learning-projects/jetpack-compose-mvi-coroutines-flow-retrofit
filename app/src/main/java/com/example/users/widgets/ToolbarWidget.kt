package com.example.users.widgets

import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.users.MainViewModel
import com.example.users.R
import com.example.users.domain.module.User
import com.example.users.domain.util.Resource
import com.example.users.ui.theme.ErrorWidget
import com.example.users.ui.theme.LoadingWidget
import com.example.users.ui.theme.SuccessWidget

@Composable
fun ToolbarWidget(
    viewModel: MainViewModel
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Users",
                        color = Color.White
                    )
                },
                // below line is use to give background color
                backgroundColor = colorResource(id = R.color.purple_500),

                // content color is use to give
                // color to our content in our toolbar.
                contentColor = Color.White,

                // below line is use to give
                // elevation to our toolbar.
                elevation = 12.dp
            )

        },
    ) {
        viewModel.getAllUsers()
        val result = viewModel.users.collectAsState().value
        Log.d("TAG", "ToolbarWidget: ${result.message}")
        when (result) {
            is Resource.Loading -> LoadingWidget()
            is Resource.Success -> SuccessWidget(list = result.data ?: emptyList())
            is Resource.Error -> ErrorWidget(error = result.message ?: "Unknown error!")
        }

    }
}

@Preview
@Composable
fun ToolbarWidgetPreview() {
//    ToolbarWidget()
}
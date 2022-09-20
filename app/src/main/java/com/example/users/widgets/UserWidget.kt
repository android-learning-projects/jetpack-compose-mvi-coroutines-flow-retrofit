package com.example.users.widgets

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.users.ui.theme.Gray200

@Composable
fun UserWidget(
    userIcon: Int,
    name: String,
    email: String,
    status: String,
    gender: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Gray200)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {

            Image(
                painter = painterResource(id = userIcon),
                contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),

            )
            Box(
                modifier = Modifier
                    .size(14.dp)
                    .clip(CircleShape)
                    .background(if (status == "active") Color.Green else Color.Gray)
            )
        }
        Spacer(modifier = Modifier.padding(start = 8.dp))

        Column() {
            Text(
                text = name,
                style = MaterialTheme.typography.h6,
            )

            Text(
                text = email,
                style = MaterialTheme.typography.subtitle1,
            )

        }

    }
}

@Preview
@Composable
fun UserWidgetPreview() {
    UserWidget(
        userIcon = com.example.users.R.drawable.ic_launcher_background,
        email = "test@gmail.com",
        gender = "female",
        status = "active",
        name = "Rajan"
    )
}
package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.ui.theme.Orange
import com.example.cinema_tickets_compose.ui.theme.White60
import com.example.cinema_tickets_compose.ui.theme.White87

@Composable
fun ImageMovie() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Movie Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
    }
    RowIcon()

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(top = 180.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconPlay()

    }


}

@Composable
fun RowIcon() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .padding(top= 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconClose()
        IconClock()
    }

}

@Composable
fun IconClock() {
    Row(
        modifier = Modifier
            .clip(RectangleShape)
            .background(Color.White.copy(alpha = .3f), shape = CircleShape)
            .padding(horizontal = 8.dp, vertical = 4.dp), horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.clock_circle),
            contentDescription = "",
            tint = White60,
            modifier = Modifier.size(16.dp)
        )
        SpacerHorizontal(width = 4.dp)
        DefaultText(
            text = "2h 23m",
            colors = White87, fontSize = 12.sp
        )
    }
}

@Composable
fun IconClose() {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(Color.White.copy(alpha = .3f))
            .size(32.dp),
        contentAlignment = Alignment.Center

    ) {

        Icon(
            painter = painterResource(id = R.drawable.close_circle),
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
fun IconPlay() {
    IconButton(onClick = {}, modifier = Modifier.size(56.dp)) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
                .background(Orange),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_play),
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier.size(24.dp),
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun PreviewImageMovie() {
    ImageMovie()

}
package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor
import com.example.cinema_tickets_compose.ui.theme.White60
import com.example.cinema_tickets_compose.ui.theme.White87

@Composable
fun ButtonRow(){
        Row(){
            DefaultButton(text = "ssss", onClick = {})
            SpacerHorizontal(width = 8.dp)
            TransparentButton(text = "ssssssssssss", onClick = {})
        }
    }
@Composable
fun BottomNavIcons(){
    Row(modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween){
        IconButton(onClick = {}, modifier = Modifier.size(32.dp)) {
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
        Icon(
            painter = painterResource(id = R.drawable.icon_search),
            contentDescription = "",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )

        Icon(
            painter = painterResource(id = R.drawable.icon_vedio),
            contentDescription = "",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.icon_user),
            contentDescription = "",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
    }
}
@Composable
fun DateIcon() {
    Row(
        modifier = Modifier
            .clip(RectangleShape)
            .padding(horizontal = 8.dp, vertical = 4.dp), horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.clock_circle),
            contentDescription = "",
            tint = SecondaryTextColor,
            modifier = Modifier.size(16.dp)
        )
        SpacerHorizontal(width = 4.dp)
        DefaultText(
            text = "2h 23m",
            colors = PrimaryTextColor, fontSize = 12.sp
        )
    }
}

@Preview
//    (showBackground = true)
@Composable
fun PreviewButtonColor(){
//    ButtonRow()
//    BottomNavIcons()
    DateIcon()
}
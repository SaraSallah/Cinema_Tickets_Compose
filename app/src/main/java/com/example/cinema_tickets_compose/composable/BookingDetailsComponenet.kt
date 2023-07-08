package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor
import com.example.cinema_tickets_compose.ui.theme.Rubik
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor


@Composable
fun TextTime(time: String) {
    Card(
        modifier = Modifier.size(width = 60.dp, height = 30.dp),
        colors = CardDefaults.cardColors(containerColor = White),
        border = BorderStroke(0.2.dp, color = Gray),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = time,
                fontSize = 14.sp,
                fontFamily = Rubik,
                color = Black,
                fontWeight = FontWeight.Normal,
            )
        }

    }

}

@Composable
fun ColumnCardCalender(number: Int, day: String) {
    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = SecondaryTextColor,
                shape = RoundedCornerShape(8.dp)
            )
            .wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = number.toString(),
                modifier = Modifier.padding(horizontal = 4.dp),
                textAlign = TextAlign.Center

            )

        }
        Row() {
            Text(
                text = day,
                modifier = Modifier
                    .padding(horizontal = 4.dp)

            )

        }


    }
}
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun Date(number: Int, day: String) {
    Card(
        modifier = Modifier
            .size(width = 60.dp, height = 70.dp),
        colors = CardDefaults.cardColors(containerColor = White),
        border = BorderStroke(0.2.dp, color = Gray),
        shape = RoundedCornerShape(16.dp),

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = number.toString(),
                fontSize = 20.sp,
                fontFamily = Rubik,
                color = PrimaryTextColor,
                fontWeight = FontWeight.Medium
            )

            Text(
                text = day,
                fontSize = 16.sp,
                fontFamily = Rubik,
                color = PrimaryTextColor ,
                fontWeight = FontWeight.Normal
            )
        }

    }
}



@Composable
@Preview
fun PreviewTextTime() {
//    TextTime("22:00")
//    ColumnCardCalender(12, "Friday")

}
package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor


@Composable
fun TextTime(text: String) {
    Card(
        modifier = Modifier
            .wrapContentSize()
            .border(
                width = 1.dp,
                color = SecondaryTextColor,
                shape = CircleShape
            ).background(Color.White)
    ) {
        Text(
            text = text,
            modifier = Modifier
                .wrapContentSize()
                .padding(horizontal = 8.dp, vertical = 4.dp)

        )

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
@Preview
fun PreviewTextTime() {
//    TextTime("22:00")
    ColumnCardCalender(12, "Friday")

}
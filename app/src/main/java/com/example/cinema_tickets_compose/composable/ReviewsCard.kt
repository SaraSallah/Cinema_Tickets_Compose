package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor

@Composable
fun ReviewCard(review: String, type: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            DefaultText(
                text = review, colors = PrimaryTextColor, fontSize = 14.sp
            )
            SpacerVertical(height = 4.dp)
            DefaultText(
                text = type, colors = SecondaryTextColor, fontSize = 14.sp
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewReviewCard() {
    ReviewCard("4/10", "Rotten Tomatoes")
}
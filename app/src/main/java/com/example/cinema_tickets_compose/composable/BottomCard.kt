package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor

@Composable
fun BottomCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeight(450.dp),
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            Row() {
                Box(modifier = Modifier.weight(1f)) {
                    ReviewCard(review = "6.8/10", type = "IMDb")
                }
                Box(modifier = Modifier.weight(1f)) {
                    ReviewCard(review = "63 %", type = "Rotten Tomatoes")
                }
                Box(modifier = Modifier.weight(1f)) {
                    ReviewCard(review = "64/10", type = "IGN")
                }
            }
            SpacerVertical(height = 16.dp)
            Row(Modifier.padding(horizontal = 32.dp)) {
                AlignText(
                    text = "Fantastic Beasts: The Secrets Of Dumbledore",
                    colors = PrimaryTextColor,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                )
            }
            SpacerVertical(height = 16.dp)

            Row() {
                InformationCard(text = "Fantasy", modifier = Modifier)
                SpacerHorizontal(width = 4.dp)
                InformationCard(text = "Adventure", modifier = Modifier)
            }

            SpacerVertical(height = 16.dp)
            Row(Modifier.padding(horizontal = 16.dp)) {

                AlignText(
                    text = "Professor Albus Dumbledore knows the powerful Dark wizard" +
                            " Gellert Grindelwald is moving to seize control of the wizarding ",
                    colors = PrimaryTextColor,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(modifier = Modifier.weight(1f))

            ButtonWithIcon(
                iconResId = R.drawable.booking, text = "Booking"
            ) {

            }
            SpacerVertical(height = 4.dp)


        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewBottomCard() {
    BottomCard()

}
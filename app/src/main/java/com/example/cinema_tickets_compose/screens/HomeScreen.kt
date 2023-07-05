package com.example.cinema_tickets_compose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.composable.BottomNavIcons
import com.example.cinema_tickets_compose.composable.ButtonRow
import com.example.cinema_tickets_compose.composable.DateIcon
import com.example.cinema_tickets_compose.composable.InformationCard
import com.example.cinema_tickets_compose.composable.SpacerHorizontal
import com.example.cinema_tickets_compose.composable.SpacerVertical


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerVertical(height = 16.dp)
        ButtonRow()
        Spacer(modifier = Modifier.weight(1f))

        Spacer(modifier = Modifier.weight(1f))
        DateIcon()
        SpacerVertical(height = 16.dp)
        Row(Modifier.padding(horizontal = 32.dp)) {
            com.example.cinema_tickets_compose.composable.AlignText(
                text = "Fantastic Beasts: The Secrets Of Dumbledore",
                colors = com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor,
                fontSize = 24.sp,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
            )
        }
        SpacerVertical(height = 16.dp)
        Row() {
            InformationCard(text = "Fantasy", modifier = Modifier)
            SpacerHorizontal(width = 4.dp)
            InformationCard(text = "Adventure", modifier = Modifier)
        }
        SpacerVertical(height = 16.dp)
        BottomNavIcons()

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
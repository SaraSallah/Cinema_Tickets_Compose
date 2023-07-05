package com.example.cinema_tickets_compose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinema_tickets_compose.composable.BottomCard
import com.example.cinema_tickets_compose.composable.ImageMovie

@Composable
fun BookingScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        ImageMovie()
        Column() {
            Spacer(modifier = Modifier.weight(1f))
            BottomCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookingScreen() {
    BookingScreen()

}
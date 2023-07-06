package com.example.cinema_tickets_compose.screens.booking_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets_compose.composable.BottomCard
import com.example.cinema_tickets_compose.composable.CharacterItem
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
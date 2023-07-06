package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.screens.booking_details_screen.BookingDetailsViewModel
import com.example.cinema_tickets_compose.screens.booking_details_screen.CalenderUiState
import com.example.cinema_tickets_compose.screens.booking_details_screen.CalendersUiState
import com.example.cinema_tickets_compose.screens.booking_details_screen.TimeContent

@Composable
fun BottomTicketsCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
        ) {
            LazyRawCalender()
            SpacerVertical(height = 16.dp)
            TimeContent()
            SpacerVertical(height = 16.dp)
            Spacer(modifier = Modifier.weight(1f))
            Row(){
                Column() {

                }
                ButtonWithIcon(
                iconResId = R.drawable.booking, text = "Buy Ticket"
            ) {

            }



            }



        }
    }
}

@Composable
fun LazyRawCalender(
    viewModel: BookingDetailsViewModel = hiltViewModel(),
) {
    val state by viewModel.stateBooking.collectAsState()
    LazyRawContent(state = state)
}

@Composable
private fun LazyRawContent(
    state: CalendersUiState,
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        items(state.calender) {
            CalendersItem(state = it)
        }
    }
}

@Composable
fun CalendersItem(state: CalenderUiState) {
    ColumnCardCalender(state.number, state.day)
}
//@Composable
//fun LazyRawTime(
//    viewModel: CharacterViewModel = hiltViewModel()
//) {
//    val state by viewModel.state.collectAsState()
//    LazyRawTimeContent(state = state)
//}
//
//@Composable
//private fun LazyRawTimeContent(
//    state: CalendersUiState
//) {
//    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
//        contentPadding = PaddingValues(horizontal = 16.dp)
//    ) {
//        items(state.calender) {
//            TimeItem(state = it)
//        }
//    }
//}
//
//@Composable
//fun TimeItem(state: CharacterUiState) {
//    Image(
//        painter = rememberAsyncImagePainter(model = state.image),
//        contentDescription = "Character",
//        modifier = Modifier
//            .size(75.dp)
//            .clip(CircleShape),
//        contentScale = ContentScale.Crop,
//    )
//}
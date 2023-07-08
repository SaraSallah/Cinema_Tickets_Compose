package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.screens.booking_details_screen.BookingDetailsViewModel
import com.example.cinema_tickets_compose.screens.booking_details_screen.CalenderUiState
import com.example.cinema_tickets_compose.screens.booking_details_screen.CalendersUiState
import com.example.cinema_tickets_compose.screens.booking_details_screen.TimeContent
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor
import com.example.cinema_tickets_compose.ui.theme.Rubik
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor


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
            Row(modifier = Modifier.padding(vertical =16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly

                ) {
                Box(
                    modifier = Modifier.weight(1f).padding(horizontal = 16.dp)
                ) {
                    ShowPrice()

                }

                Box() {
                    ButtonWithIcon(
                        iconResId = R.drawable.booking, text = stringResource(R.string.buy_ticket)
                    ) {
                    }


                }


            }


        }
    }
}

@Composable
fun ShowPrice() {
    Column(horizontalAlignment = Alignment.Start) {
        Text(
            text = stringResource(R.string._100_00),
            fontSize = 24.sp,
            fontFamily = Rubik,
            color = PrimaryTextColor,
            fontWeight = FontWeight.Medium

        )
        Text(
            text = stringResource(R.string._4_tickets),
            fontSize = 16.sp,
            fontFamily = Rubik,
            color = SecondaryTextColor
        )

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
    Date(state.number, state.day)
}

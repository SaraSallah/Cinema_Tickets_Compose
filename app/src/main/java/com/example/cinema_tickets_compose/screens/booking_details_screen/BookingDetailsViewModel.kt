package com.example.cinema_tickets_compose.screens.booking_details_screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookingDetailsViewModel : ViewModel() {
    private val _state = MutableStateFlow(CalendersUiState())
    val stateBooking = _state.asStateFlow()

    init {
        getAllCalenders()
    }

    private fun getAllCalenders() {
        _state.update {
            it.copy(
                calender = listOf(
                    CalenderUiState(14, "Thu"),
                    CalenderUiState(15, "Fri"),
                    CalenderUiState(16, "Sat"),
                    CalenderUiState(17, "Sun"),
                    CalenderUiState(18, "Mon"),
                    CalenderUiState(19, "Tues"),
                    CalenderUiState(20, "Wedn"),
                    CalenderUiState(20, "Wedn"),
                    CalenderUiState(20, "Wedn"),
                    CalenderUiState(20, "Wedn"),
                    CalenderUiState(20, "Wedn"),
                    CalenderUiState(20, "Wedn"),
                    CalenderUiState(20, "Wedn"),
                )
            )
        }
    }
}
package com.example.cinema_tickets_compose.screens.booking_details_screen

data class CalendersUiState(
    val calender: List<CalenderUiState> = emptyList(),
    val listTime: List<String> = listOf("10:00","12:30","15:30","18:30","22:30","00:30","02:30","04:30"),

    )

data class CalenderUiState(
    val number: Int,
    val day: String,
)
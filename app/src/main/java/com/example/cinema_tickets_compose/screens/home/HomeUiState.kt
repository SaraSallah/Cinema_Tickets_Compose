package com.example.cinema_tickets_compose.screens.home

import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.screens.booking_screen.CharacterUiState

data class HomeUiState(
    val images: List<Int> =  listOf(
        R.drawable.img_1,
        R.drawable.img_3,
        R.drawable.img_2,
    )
)

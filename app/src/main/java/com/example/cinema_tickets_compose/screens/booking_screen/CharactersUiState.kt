package com.example.cinema_tickets_compose.screens.booking_screen

data class CharactersUiState(
    val characters: List<CharacterUiState> = emptyList(),
)

data class CharacterUiState(
    val image: Int,
)

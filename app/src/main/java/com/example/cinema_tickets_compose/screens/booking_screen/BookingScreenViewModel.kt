package com.example.cinema_tickets_compose.screens.booking_screen

import androidx.lifecycle.ViewModel
import com.example.cinema_tickets_compose.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookingScreenViewModel : ViewModel() {
    private  val _state = MutableStateFlow(CharactersUiState())
    val state = _state.asStateFlow()

    init {

        getAllCharacters()
    }
    private fun getAllCharacters(){
        _state.update { it.copy(
            characters = listOf(
                CharacterUiState(R.drawable.ron_bilius),
                CharacterUiState(R.drawable.img_2),
                CharacterUiState(R.drawable.img_3),
                CharacterUiState(R.drawable.img_4),
                CharacterUiState(R.drawable.img_5),
                CharacterUiState(R.drawable.img_6),
                CharacterUiState(R.drawable.img_7),
                CharacterUiState(R.drawable.img_8),
                CharacterUiState(R.drawable.img_9),


                )
        )

        }
    }
}
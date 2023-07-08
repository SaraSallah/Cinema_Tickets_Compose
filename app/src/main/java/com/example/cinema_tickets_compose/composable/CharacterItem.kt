package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.cinema_tickets_compose.screens.booking_screen.CharacterUiState

@Composable
fun CharacterItem(state: CharacterUiState) {
    Image(
        painter = rememberAsyncImagePainter(model = state.image),
        contentDescription = "character",
        Modifier
            .size(75.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )

}
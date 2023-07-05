package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(
    text: String,
    modifier: Modifier,
) {
    Box(modifier.padding(horizontal = 4.dp)) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .border(
                    width = 1.dp,
                    color = SecondaryTextColor,
                    shape = CircleShape
                )
                .padding(horizontal = 4.dp)
        ) {
            DefaultText(
                text = text,
                colors = PrimaryTextColor, fontSize = 14.sp
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewInformationCard() {
    InformationCard("SSSS", modifier = Modifier)
}
package com.example.cinema_tickets_compose.screens.booking_details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.composable.BottomTicketsCard
import com.example.cinema_tickets_compose.composable.CinemaScreen
import com.example.cinema_tickets_compose.composable.IconClose
import com.example.cinema_tickets_compose.composable.SeatsAvailable
import com.example.cinema_tickets_compose.composable.SpacerVertical
import com.example.cinema_tickets_compose.composable.TextTime
import com.example.cinema_tickets_compose.ui.theme.Orange
import com.example.cinema_tickets_compose.ui.theme.White60

@Composable
fun Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(start = 16.dp, top = 32.dp),
        ) {
            IconClose()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CinemaScreen(painter = painterResource(id = R.drawable.img_header ) )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.5f)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 32.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SeatsAvailable(text = stringResource(R.string.available), color = White)
            SeatsAvailable(text = stringResource(R.string.taken), color = Gray)
            SeatsAvailable(text = stringResource(R.string.selected), color = Orange)
        }

        Spacer(modifier = Modifier.weight(1f))


        BottomTicketsCard()

    }



}


@Composable
fun TimeContent() {
    val state = CalendersUiState()
    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        items(state.listTime) {
            TextTime(text = it)
        }
    }
}
//
//@Composable
//fun ItemSelected(
//    modifier: Modifier = Modifier,
//    title: String,
//    icon: Int,
//    contentDescription: String? = null,
//    tint: Color = Color.Unspecified,
//) {
//    Card(
//        modifier = Modifier.fillMaxWidth(),
//        colors = CardDefaults.cardColors(Color.Black)
//    ) {
//        Icon(
//            modifier = modifier.size(6.dp),
//            painter = painterResource(icon),
//            contentDescription = contentDescription,
//            tint = tint
//        )
//        Text(text = title, color = White60)
////        Spacer(modifier = Modifier.weight(1f))
////        BottomTicketsCard()
////        TimeContent()
//
//    }
//}


@Preview(showBackground = true)
@Composable
fun PreviewBookingDetailsScreen() {
//    BookingDetailsScreen()
    Screen()

}
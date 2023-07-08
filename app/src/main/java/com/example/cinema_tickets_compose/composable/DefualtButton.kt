package com.example.cinema_tickets_compose.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets_compose.ui.theme.Orange

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.ui.theme.Orange
import com.example.cinema_tickets_compose.ui.theme.SecondaryTextColor
import com.example.cinema_tickets_compose.ui.theme.White60

@Composable
fun DefaultButton(
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(Orange)
    ) {

        Text(text)
    }
}

@Composable
fun TransparentButton(
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults
            .buttonColors(Color.Transparent),
                modifier = Modifier.wrapContentSize()
            .border(
                width = 1.dp,
                color = White60,
                shape = CircleShape
            ),
    ) {
        Text(text)
    }
}


@Composable
fun ButtonWithIcon(
    iconResId: Int,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(Orange)
    ) {
        Row(modifier = Modifier.padding(vertical = 4.dp)) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null
            )
            SpacerHorizontal(width = 8.dp)
            Text(text)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonWithIconPreview() {
//    ButtonWithIcon(
//        iconResId = R.drawable.booking,
//        text = "Share",
//        onClick = {}
//    )
    TransparentButton(text = "Share", onClick = {})
}
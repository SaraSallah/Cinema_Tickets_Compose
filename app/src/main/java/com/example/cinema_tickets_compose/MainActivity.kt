package com.example.cinema_tickets_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cinema_tickets_compose.ui.theme.Cinema_Tickets_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cinema_Tickets_ComposeTheme {

            }
        }
    }
}

package com.example.cinema_tickets_compose.screens.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.cinema_tickets_compose.R

sealed class BottomNavigationScreen(
    val route: String,
    val icon: Int,
) {
    object Home : BottomNavigationScreen(
        route = "home",
        icon = R.drawable.icon_play
        )
    object Search : BottomNavigationScreen(
        route = "search",
        icon = R.drawable.icon_search
    )
    object Notification : BottomNavigationScreen(
        route = "notification",
        icon = R.drawable.icon_vedio
    )
    object Profile : BottomNavigationScreen(
        route = "profile",
        icon = R.drawable.icon_user
    )

}


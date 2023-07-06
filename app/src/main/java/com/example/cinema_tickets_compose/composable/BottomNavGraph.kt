package com.example.cinema_tickets_compose.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cinema_tickets_compose.screens.NotificationScreen
import com.example.cinema_tickets_compose.screens.ProfileScreen
import com.example.cinema_tickets_compose.screens.SearchScreen
import com.example.cinema_tickets_compose.screens.home.BottomNavigationScreen
import com.example.cinema_tickets_compose.screens.home.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavigationScreen.Home.route ){
        composable(route =  BottomNavigationScreen.Home.route){
            HomeScreen()
        }
        composable(route =  BottomNavigationScreen.Notification.route){
            NotificationScreen()
        }
        composable(route =  BottomNavigationScreen.Profile.route){
            ProfileScreen()
        }
        composable(route =  BottomNavigationScreen.Search.route){
            SearchScreen()
        }
    }

}
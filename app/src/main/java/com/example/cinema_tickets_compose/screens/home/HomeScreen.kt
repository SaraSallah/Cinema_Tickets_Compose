package com.example.cinema_tickets_compose.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.cinema_tickets_compose.R
import com.example.cinema_tickets_compose.composable.BlureImage
import com.example.cinema_tickets_compose.composable.BottomNavIcons
import com.example.cinema_tickets_compose.composable.ButtonRow
import com.example.cinema_tickets_compose.composable.DateIcon
import com.example.cinema_tickets_compose.composable.HorizontalImages
import com.example.cinema_tickets_compose.composable.InformationCard
import com.example.cinema_tickets_compose.composable.SpacerHorizontal
import com.example.cinema_tickets_compose.composable.SpacerVertical
import com.example.cinema_tickets_compose.ui.theme.Orange
import com.example.cinema_tickets_compose.ui.theme.White87


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        val navController = rememberNavController()
//        Scaffold(
//            bottomBar = { BottomBar(navController = navController)}
//        ) {
//            BottomNavGraph(navController = navController)
//        }
        Box(
            modifier = Modifier.fillMaxSize()
        ) {


            BlureImage()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SpacerVertical(height = 16.dp)
                ButtonRow()
                SpacerVertical(height = 32.dp)
                PagerContent()

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SpacerVertical(height = 16.dp)
                    DateIcon()
                    SpacerVertical(height = 16.dp)
                    Row(Modifier.padding(horizontal = 32.dp)) {
                        com.example.cinema_tickets_compose.composable.AlignText(
                            text = "Fantastic Beasts: The Secrets Of Dumbledore",
                            colors = com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor,
                            fontSize = 24.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        )
                    }
                    SpacerVertical(height = 16.dp)
                    Row() {
                        InformationCard(text = "Fantasy", modifier = Modifier)
                        SpacerHorizontal(width = 4.dp)
                        InformationCard(text = "Adventure", modifier = Modifier)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    BottomNavIcons()
                    SpacerVertical(height = 16.dp)

                }
            }
        }
    }


}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerContent(){
    val pagerState = rememberPagerState()
    val images = listOf(R.drawable.img_10, R.drawable.img_13, R.drawable.img_12)
    HorizontalImages(
        onClickImage = { pageIndex ->
            // Handle image click event
            // You can perform actions like displaying a larger version of the image
            // or navigating to a detail screen based on the pageIndex.
            println("Clicked image at index: $pageIndex")
        },
        pagerState = pagerState,
        images = images,
        modifier = Modifier.wrapContentSize()
    )

}


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomNavigationScreen.Home,
        BottomNavigationScreen.Search,
        BottomNavigationScreen.Notification,
        BottomNavigationScreen.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    BottomNavigation(
        backgroundColor = Color.Transparent,
        elevation = 0.dp
    ) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination, navController = navController
            )

        }

    }

}

@Composable
fun RowScope.AddItem(
    screen: BottomNavigationScreen,
    currentDestination: NavDestination?,
    navController: NavHostController,
) {
    BottomNavigationItem(
        icon = {
            val isSelected = currentDestination?.hierarchy?.any {
                it.route == screen.route
            } == true

            val iconTintColor = if (isSelected) White87 else Color.Black

            Row(
                modifier = Modifier
                    .size(52.dp)
                    .clip(if (isSelected) CircleShape else RoundedCornerShape(0.dp))
                    .background(if (isSelected) Orange else Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Icon(
                    painter = painterResource(screen.icon),
                    contentDescription = screen.route,
                    tint = iconTintColor,
                )
                // Add additional content if needed
            }
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
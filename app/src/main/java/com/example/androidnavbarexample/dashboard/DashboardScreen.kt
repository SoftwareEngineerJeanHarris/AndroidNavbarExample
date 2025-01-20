package com.example.androidnavbarexample.dashboard

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidnavbarexample.dashboard.ui.DrawerContent
import com.example.androidnavbarexample.dashboard.viewmodel.DashboardViewModel
import com.example.androidnavbarexample.home.HomeScreen
import com.example.androidnavbarexample.profile.ProfileScreen
import kotlinx.coroutines.launch

@Composable
fun DashboardScreen(viewModel: DashboardViewModel) {
    val navController = rememberNavController() // Initialize here
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DrawerContent(
                onDestinationClicked = { route ->
                    scope.launch { drawerState.close() }
                    navController.navigate(route) // Use the local navController
                }
            )
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = "home"
        ) {
            composable("home") { HomeScreen() }
            composable("profile") { ProfileScreen() }
        }
    }
}
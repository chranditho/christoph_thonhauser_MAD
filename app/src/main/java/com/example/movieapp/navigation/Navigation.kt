package com.example.movieapp.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.DetailScreen
import com.example.movieapp.screens.FavoriteScreen
import com.example.movieapp.screens.HomeScreen

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") {
            HomeScreen(navController)
        }

        composable(route = "favorite") {
            FavoriteScreen(navController = navController)
        }

        composable(
            route = "detail/{movieId}",
            arguments = listOf(navArgument("movieId") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            DetailScreen(navController, movieId = backStackEntry.arguments?.getString("movieId"))
        }
    }
}
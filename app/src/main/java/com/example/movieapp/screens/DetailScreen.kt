package com.example.movieapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.movieapp.models.Movie
import com.example.movieapp.models.getMovies
import com.example.movieapp.widgets.TopAppBar

@Composable
fun DetailScreen(navController: NavController, movieId: String?) {
    val movie: Movie = getMovies().filter { it.id == movieId }[0]

    TopAppBar(title = movie.title, showDropDownMenu = false, showBackButton = true, navController = navController)


}
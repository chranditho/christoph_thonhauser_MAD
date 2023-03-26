package com.example.movieapp.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.movieapp.models.Movie
import com.example.movieapp.models.getMovies
import com.example.movieapp.widgets.MovieRow
import com.example.movieapp.widgets.TopAppBar

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun DetailScreen(navController: NavController, movieId: String?) {
    val movie: Movie = getMovies().filter { it.id == movieId }[0]

    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
    ) {

        Column {

            TopAppBar(
                title = movie.title,
                showDropDownMenu = false,
                showBackButton = true,
                navController = navController
            )
            MovieRow(movie = movie)


        }
    }
}
package com.example.movieapp.widgets

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.movieapp.models.Movie
import com.example.movieapp.models.getMovies

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun MyList(
    navController: NavController = rememberNavController(), movies: List<Movie> = getMovies()
) {
    LazyColumn {
        items(movies) { movie ->
            MovieRow(
                movie = movie,
            ) { movieId ->
                Log.d("MyList", "item clicked $movieId")
                navController.navigate("detail/$movieId")
            }
        }
    }
}
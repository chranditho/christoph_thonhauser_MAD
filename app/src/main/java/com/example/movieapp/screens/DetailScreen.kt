package com.example.movieapp.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
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
            MovieLazyRow(movieImages = movie.images)

        }
    }
}

@Composable
fun MovieLazyRow(movieImages: List<String>) {

    LazyRow(modifier = Modifier.fillMaxWidth()) {
        itemsIndexed(movieImages) { index, image ->
            Card(
                modifier = Modifier
                    .width(180.dp)
                    .height(120.dp)
                    .padding(horizontal = 8.dp),
                elevation = 8.dp
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = rememberAsyncImagePainter(
                            ImageRequest.Builder(LocalContext.current).data(data = image)
                                .apply(block = fun ImageRequest.Builder.() {
                                    crossfade(true)
                                }).build()
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}
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
import com.example.movieapp.widgets.MyList
import com.example.movieapp.widgets.TopAppBar

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun FavoriteScreen(navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
    ) {

        Column {

            TopAppBar(
                title = "Favorites",
                showDropDownMenu = false,
                showBackButton = false,
                navController = navController
            )
            MyList(navController)


        }
    }
}
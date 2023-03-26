package com.example.movieapp.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.widgets.MyList


@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun HomeScreen(navController: NavController) {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
    ) {

        Column {
            com.example.movieapp.widgets.TopAppBar(
                "Movies",
                navController = navController
            )
            Greeting()
            Text(
                style = MaterialTheme.typography.h6, text = "Movie List"
            )
            MyList(navController)
        }
    }
}


@Preview
@Composable
fun WelcomeText(modifier: Modifier = Modifier, text: String = "default") {
    Row(
        modifier = modifier
            .padding(16.dp)
            .background(Color.Blue)
            .fillMaxWidth()
    ) {
        Text(modifier = modifier, text = "Hola")
        Text(text = text)
    }

}

@Preview
@Composable
fun Greeting() {
    Column(modifier = Modifier.padding(16.dp)) {
        var name by remember {
            mutableStateOf("")
        }

        Text(text = "Hello ${name}!")

        OutlinedTextField(value = name, onValueChange = {
            name = it
        }, label = { Text("Name") })
    }
}
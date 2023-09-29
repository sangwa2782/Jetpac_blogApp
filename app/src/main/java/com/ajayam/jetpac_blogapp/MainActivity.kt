package com.ajayam.jetpac_blogapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ajayam.jetpac_blogapp.ui.theme.Jetpac_blogAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    var theme = remember{ mutableStateOf(false) }
    Jetpac_blogAppTheme(theme.value) {

        Column {
            Text(
                text = "Ajayam Company",
                style = MaterialTheme.typography.headlineLarge
            )
            Button(onClick = {
                theme.value = !theme.value
            }) {
                Text(text = "Change Theme")
            }
        }


    }
}





package com.example.jetpackcompose02_2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose02_2025.ui.theme.JetPackCompose02_2025Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose02_2025Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    MyLayout()
}

@Composable
fun MyLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Green)) {
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)) {

            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)) {
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .background(Color.DarkGray)) {
                    }
                    Box(
                        Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Box Blanco")
                    }
                }
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red)) {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyLayout()
}

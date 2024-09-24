package com.example.continuousintegration

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.continuousintegration.ui.theme.ContinuousIntegrationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContinuousIntegrationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("CI/CD Novice")
                    EditText()
                    Button()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun EditText() {
    OutlinedTextField(value = "enter text", onValueChange = {})
}

@Composable
fun Button() {
    Button(onClick = {
        Log.d(
            "TAG",
            "Button: Button action triggered"
        )
    }) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContinuousIntegrationTheme {
        Greeting("Android")
    }
}
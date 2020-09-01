package com.tfandkusu.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewGreeting()
        }
    }

    @Composable
    @Preview
    fun PreviewGreeting() {
        Greeting(name = "Android")
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name !")
    }
}

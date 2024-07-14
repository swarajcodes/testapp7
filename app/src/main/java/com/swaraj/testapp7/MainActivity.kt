package com.swaraj.testapp7

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.swaraj.testapp7.ui.theme.Testapp7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Testapp7Theme {
                Text(text = "hello from first text", color = Color.Blue )
                
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("I started using onStart()")
    }

    override fun onResume() {
        super.onResume()
        println("I started using onResume()")
    }

    override fun onPause() {
        super.onPause()
        println("i started using onpause()")
    }

    override fun onStop() {
        super.onStop()
        println("stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("destroyed")
    }
}


package com.example.androidnavbarexample

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
import com.example.androidnavbarexample.dashboard.DashboardScreen
import com.example.androidnavbarexample.dashboard.viewmodel.DashboardViewModel
import com.example.androidnavbarexample.ui.theme.AndroidNavbarExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = DashboardViewModel()
            DashboardScreen(viewModel = viewModel)
        }
    }
}
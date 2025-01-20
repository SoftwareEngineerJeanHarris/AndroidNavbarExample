package com.example.androidnavbarexample.dashboard.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContent(onDestinationClicked: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Home",
            modifier = Modifier.clickable { onDestinationClicked("home") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Profile",
            modifier = Modifier.clickable { onDestinationClicked("profile") }
        )
    }
}
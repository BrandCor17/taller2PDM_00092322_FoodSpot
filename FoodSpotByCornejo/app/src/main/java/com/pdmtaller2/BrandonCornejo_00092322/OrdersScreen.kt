package com.pdmtaller2.BrandonCornejo_00092322


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrdersScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pantalla de órdenes") }
            )

        }
    ) { paddingValues ->
        Text(
            text = "Lista de ordenes",
            modifier = Modifier.padding(paddingValues).padding(16.dp)
        )

    }
}

@Composable
@Preview (showBackground = true)
fun OrdersScreenPreview() {
    OrdersScreen()
}
package com.pdmtaller2.BrandonCornejo_00092322

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.BrandonCornejo_00092322.ui.*
import com.pdmtaller2.BrandonCornejo_00092322.DummyData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodSpotApp()
        }
    }
}

@Composable
fun FoodSpotApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)

        ) {
            composable("home") { RestaurantListScreen(navController, DummyData.restaurants) }
            composable("search") { OrdersScreen() }
            composable("orders") { OrdersScreen() }
            composable("menu/{restaurantId}") { backStackEntry ->
                val id = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
                val restaurant = DummyData.restaurants.find { it.id == id }
                restaurant?.let {
                    MenuScreen(it, navController)
                }
            }
        }
    }
}
@Composable
@Preview (showBackground = true)
fun DefaultPreview() {
    FoodSpotApp()
}
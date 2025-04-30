package com.pdmtaller2.BrandonCornejo_00092322


data class Dish(
    val name: String,
    val description: String,
    val imageUrl: String
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val menu: List<Dish>
)

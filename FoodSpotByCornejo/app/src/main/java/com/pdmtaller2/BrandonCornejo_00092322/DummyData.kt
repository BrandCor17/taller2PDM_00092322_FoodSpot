package com.pdmtaller2.BrandonCornejo_00092322

object DummyData {
    val restaurants = listOf(
        Restaurant(
            id = 1,
            name = "Taco Loco",
            description = "Auténtica comida mexicana.",
            imageUrl = "https://cdn.pixabay.com/photo/2017/01/22/19/20/tacos-2009598_960_720.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish(
                    name = "Tacos al Pastor",
                    description = "Deliciosos tacos con piña y cerdo.",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/02/18/24/taco-2368835_960_720.jpg"
                ),
                Dish(
                    name = "Quesadilla",
                    description = "Queso derretido en tortilla de maíz.",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/05/04/22/37/quesadilla-3375125_960_720.jpg"
                ),
                Dish(
                    name = "Chilaquiles Verdes",
                    description = "Totopos con salsa verde, crema y queso.",
                    imageUrl = "https://cdn.pixabay.com/photo/2022/05/20/22/22/chilaquiles-7209858_960_720.jpg"
                )
            )
        ),

        Restaurant(
            id = 2,
            name = "Pizza Nova",
            description = "Lo mejor de Italia.",
            imageUrl = "https://cdn.pixabay.com/photo/2017/12/09/08/18/pizza-3007395_960_720.jpg",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Pizza Margarita", "Salsa de tomate, mozzarella y albahaca", "https://cdn.pixabay.com/photo/2016/02/12/21/11/pizza-1198768_960_720.jpg"),
                Dish("Lasaña", "Capas de pasta con carne y queso", "https://cdn.pixabay.com/photo/2017/06/08/14/47/lasagna-2385805_960_720.jpg")
            )
        ),
        Restaurant(
            id = 3,
            name = "Burger Max",
            description = "Hamburguesas gigantes y papas.",
            imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_960_720.jpg",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Hamburguesa Doble", "Con queso, bacon y carne doble", "https://cdn.pixabay.com/photo/2021/08/06/15/51/burger-6527083_960_720.jpg"),
                Dish("Papas Fritas", "Crujientes con salsa especial", "https://cdn.pixabay.com/photo/2017/09/26/13/40/french-fries-2782361_960_720.jpg")
            )
        ),
        Restaurant(
            id = 4,
            name = "Sakura Sushi",
            description = "Comida japonesa y rolls de sushi.",
            imageUrl = "https://cdn.pixabay.com/photo/2017/05/07/08/56/sushi-2294363_960_720.jpg",
            category = "Comida Asiática",
            menu = listOf(
                Dish("California Roll", "Roll con aguacate, cangrejo y pepino", "https://cdn.pixabay.com/photo/2014/12/15/13/40/maki-569087_960_720.jpg"),
                Dish("Nigiri de Salmón", "Salmón fresco sobre arroz", "https://cdn.pixabay.com/photo/2018/03/10/18/40/sushi-3218502_960_720.jpg")
            )
        ),
        Restaurant(
            id = 5,
            name = "Verde Vivo",
            description = "Comida saludable y vegana.",
            imageUrl = "https://cdn.pixabay.com/photo/2017/01/16/19/40/salad-1986283_960_720.jpg",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Ensalada Detox", "Con kale, zanahoria, quinoa y hummus", "https://cdn.pixabay.com/photo/2017/12/10/14/47/salad-3018944_960_720.jpg"),
                Dish("Smoothie Verde", "Espinaca, manzana y jengibre", "https://cdn.pixabay.com/photo/2016/01/19/15/05/smoothie-1149731_960_720.jpg")
            )
        ),
        Restaurant(
            id = 6,
            name = "Dulce Tentación",
            description = "Pasteles, cupcakes y delicias.",
            imageUrl = "https://cdn.pixabay.com/photo/2017/02/07/13/42/cake-2048732_960_720.jpg",
            category = "Postres y Dulces",
            menu = listOf(
                Dish("Cheesecake de Fresa", "Con base de galleta y fresas frescas", "https://cdn.pixabay.com/photo/2016/11/29/04/14/birthday-cake-1869391_960_720.jpg"),
                Dish("Brownie con Helado", "Chocolate intenso con bola de vainilla", "https://cdn.pixabay.com/photo/2017/09/26/15/42/brownies-2787470_960_720.jpg")
            )
        ),
        Restaurant(
            id = 7,
            name = "Bebidas Cool",
            description = "Refrescos, jugos y cafés fríos.",
            imageUrl = "https://cdn.pixabay.com/photo/2016/07/22/09/59/iced-coffee-1532300_960_720.jpg",
            category = "Bebidas",
            menu = listOf(
                Dish("Té Helado de Durazno", "Refrescante y natural", "https://cdn.pixabay.com/photo/2016/08/09/21/47/iced-tea-1583888_960_720.jpg"),
                Dish("Limonada con Hierbabuena", "Cítrica y aromática", "https://cdn.pixabay.com/photo/2018/06/14/13/34/lemonade-3475429_960_720.jpg")
            )
        ),
        Restaurant(
            id = 8,
            name = "El Sombrero",
            description = "Tradición y sabor mexicano.",
            imageUrl = "https://cdn.pixabay.com/photo/2021/08/06/20/44/mexican-food-6527573_960_720.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Enchiladas Rojas", "Enchiladas con salsa picante y queso", "https://cdn.pixabay.com/photo/2021/08/06/20/47/enchiladas-6527581_960_720.jpg"),
                Dish("Nachos con Guacamole", "Totopos, guacamole y queso fundido", "https://cdn.pixabay.com/photo/2018/04/30/11/58/nachos-3368324_960_720.jpg")
            )
        ),
        Restaurant(
            id = 9,
            name = "Casa de Tacos",
            description = "Lo mejor del norte de México.",
            imageUrl = "https://cdn.pixabay.com/photo/2017/02/23/19/39/taco-2096899_960_720.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Taco de Carne Asada", "Carne jugosa con salsa verde", "https://cdn.pixabay.com/photo/2018/08/30/19/01/taco-3641574_960_720.jpg"),
                Dish("Burrito de Pollo", "Pollo, arroz, frijoles y queso", "https://cdn.pixabay.com/photo/2017/07/28/14/28/burrito-2547987_960_720.jpg")
            ))
    )
}

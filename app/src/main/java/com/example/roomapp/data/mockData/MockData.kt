package com.example.roomapp.data.mockData

import com.example.roomapp.domain.models.Heroe

class MockData {
    companion object{
        val heroe = listOf<Heroe>(
            Heroe(1, "Thor",  "imagen_thor.jpg"),
            Heroe(2, "Iron Man",  "imagen_iron_man.jpg"),
            Heroe(3, "Spiderman",  "imagen_spiderman.jpg"),
            Heroe(4, "Black Panther",  "imagen_black_panther.jpg"),
            Heroe(5, "Hulk",  "imagen_hulk.jpg"),
        )
    }
}
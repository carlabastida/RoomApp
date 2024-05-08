package com.example.roomapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "heroe")
data class Heroe(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val imagen : String
)
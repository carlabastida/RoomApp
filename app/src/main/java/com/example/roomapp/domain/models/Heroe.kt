package com.example.roomapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "heroe")
data class Heroe(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val bando : Int,
    val imagen : String,
    val poder: String
):Serializable
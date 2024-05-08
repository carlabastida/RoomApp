package com.example.roomapp.domain.repositories

import com.example.roomapp.domain.models.Heroe
import kotlinx.coroutines.flow.Flow

interface HeroeRepository {
    suspend fun getHeroe() : Flow<List<Heroe>>
}
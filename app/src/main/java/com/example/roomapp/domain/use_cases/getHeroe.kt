package com.example.roomapp.domain.use_cases

import kotlinx.coroutines.flow.Flow
import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.domain.repositories.HeroeRepository

class getHeroe (
    private val repository : HeroeRepository
) {
    suspend operator fun invoke() : Flow<List<Heroe>> {
        return repository.getHeroe()
    }
}
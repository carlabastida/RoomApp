package com.example.roomapp.presentation.states

import com.example.roomapp.domain.models.Heroe

data class HeroeState(
    val heroe : List<Heroe> = emptyList()
)
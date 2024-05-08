package com.example.roomapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomapp.domain.use_cases.getHeroe
import com.example.roomapp.presentation.states.HeroeState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val getHeroe: getHeroe
) : ViewModel(){
    private val _state = MutableStateFlow(HeroeState())
    val state = _state.asStateFlow()

    init {
        loadProducts()
    }

    private fun loadProducts(){
        viewModelScope.launch {
            try {
                getHeroe().collect{
                    _state.value = HeroeState(heroe = it)
                }
            }
            catch (e : Exception){
                Log.i("ERROR","Falló el metodo get Heroes")
            }
        }
    }
}
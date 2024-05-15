package com.example.roomapp.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomapp.R
import com.example.roomapp.domain.adapters.HeroesAdapter
import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.presentation.states.HeroeState
import com.example.roomapp.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private val mainViewModel : MainViewModel by viewModels()
    private lateinit var recyclerView : RecyclerView
    private lateinit var filteredHeroe: List<Heroe>
    private var bando : Int = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bando = intent.getIntExtra("bando", -1)
        observeState()
    }

    private fun observeState(){
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                mainViewModel.state.collect{
                    Log.i("BestHeroes", it.heroe.toString())
                    filteredHeroe = it.heroe.filter { heroe -> heroe.bando == bando }
                    recyclerView = findViewById(R.id.recyclerView)
                    recyclerView.adapter = HeroesAdapter(filteredHeroe){heroe ->
                        val intent = Intent(this@HomeActivity, HoreDetailActivity::class.java).apply {
                            putExtra("heroe", heroe)
                        }
                        startActivity(intent)
                    }
                    val layoutManager = GridLayoutManager(this@HomeActivity, 2)
                    recyclerView.layoutManager = layoutManager
                }
            }
        }
    }

}
package com.example.roomapp.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomapp.R
import com.example.roomapp.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var btnMar: Button
    private lateinit var btnDc: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMar = findViewById(R.id.btnMarvel)
        btnMar.setOnClickListener {
            val selectedBando = 1
            val intent = Intent(this, HomeActivity::class.java).apply {
                putExtra("bando", selectedBando)
            }
            startActivity(intent)
        }

        btnDc = findViewById(R.id.btnDCI)
        btnDc.setOnClickListener {
            val selectedBando = 2
            val intent = Intent(this, HomeActivity::class.java).apply {
                putExtra("bando", selectedBando)
            }
            startActivity(intent)
        }

    }
}


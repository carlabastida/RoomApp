package com.example.roomapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.roomapp.R
import com.example.roomapp.domain.models.Heroe
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoreDetailActivity : AppCompatActivity() {
    private lateinit var heroeName : TextView
    private lateinit var heroePoder : TextView
    private lateinit var heroeImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_heroe_detail)
        heroeName = findViewById(R.id.nameTH)
        heroePoder = findViewById(R.id.poderTH)
        heroeImage = findViewById(R.id.imageView)

        val heroe = intent.getSerializableExtra("heroe") as Heroe

        heroeName.text = heroe.name
        heroePoder.text = heroe.poder
        Picasso.get().load(heroe.imagen).resize(600, 200)
            .centerInside().into(heroeImage)
    }
}
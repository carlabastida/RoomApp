package com.example.roomapp.domain.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomapp.R
import com.example.roomapp.domain.models.Heroe
import com.squareup.picasso.Picasso


class HeroesAdapter(
    private val heroe: List<Heroe>,
    val onClick : (Heroe) -> Unit
) : RecyclerView.Adapter<HeroeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item, parent, false)
        return HeroeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroe.size
    }

    override fun onBindViewHolder(holder: HeroeViewHolder, poder: Int) {
        val heroe = heroe[poder]
        holder.heroeTH.text = heroe.name
        holder.poderTH.text = heroe.poder
        Picasso.get().load(heroe.imagen).resize(600, 200)
            .centerInside().into(holder.imageH)
        holder.itemView.setOnClickListener {
            onClick(heroe)
        }
    }
}
class HeroeViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val heroeTH : TextView
    val poderTH : TextView
    val imageH : ImageView

    init {
        heroeTH = view.findViewById(R.id.thHeroeName)
        poderTH = view.findViewById(R.id.thHeroePoder)
        imageH = view.findViewById(R.id.imgHeroe)
    }
}
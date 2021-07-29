package com.example.skotlin.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skotlin.R
import com.example.skotlin.model.datamodel.Pokemon
import com.example.skotlin.model.datamodel.PokemonResults

class PokemonAdapter(private val pokemons:Pokemon): RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = pokemons.name
        holder.experience.text = pokemons.base_experience
        holder.heigth.text = pokemons.height.toString()
        holder.weight.text = pokemons.weight.toString()
        holder.slot1.text = pokemons.Types[0].type.name
        holder.slot2.text = pokemons.Types[1].type.name


    }

    override fun getItemCount()=1

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name : TextView = itemView.findViewById(R.id.txtName)
        val experience : TextView = itemView.findViewById(R.id.txtBaseExperience)
        val heigth : TextView = itemView.findViewById(R.id.txtHeigth)
        val weight : TextView = itemView.findViewById(R.id.txtWeight)
        val slot1 : TextView = itemView.findViewById(R.id.txtSlot1)
        val slot2 : TextView = itemView.findViewById(R.id.txtSlot2)
        //val imageView :ImageView = itemView.findViewById(R.id.imageViewDetails)

    }
}
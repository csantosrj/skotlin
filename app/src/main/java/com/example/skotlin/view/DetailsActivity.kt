package com.example.skotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skotlin.R
import com.example.skotlin.adapter.PokemonAdapter
import com.example.skotlin.model.datamodel.Pokemon
import com.google.gson.Gson
import com.google.gson.JsonParser

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val data:String = intent.getStringExtra("Data")!!
        val gson = Gson()
        val objectData = gson.fromJson(data, Pokemon::class.java)
        //val imageView : ImageView = findViewById(R.id.imageViewDetails)!!

        //Glide.with(this).load(objectData.sprites.other.official_artwork.front_default).into(imageView);
        showData(objectData)
    }

    fun showData(pokemon: Pokemon){
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@DetailsActivity)
            adapter = PokemonAdapter(pokemon)
        }
    }
}
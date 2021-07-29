package com.example.skotlin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.skotlin.R
import com.example.skotlin.adapter.PokemonAdapter
import com.example.skotlin.model.API.Api
import com.example.skotlin.model.API.ApiService
import com.example.skotlin.model.datamodel.Pokemon
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private var pokemon: Pokemon?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiclient = Api.client.create(ApiService::class.java)


        val call = apiclient.getAllPokemon()
            call.enqueue(object : Callback<Pokemon>{
                override fun onResponse(
                    call: Call<Pokemon>,
                    response: Response<Pokemon>
                ) {
                    pokemon = response.body()!!
                    showData(pokemon!!)
                }

                override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    d("Pokemon", "onFailure")
                }
            })


        val button :Button = findViewById(R.id.btnDetails)
        val intent = Intent(this@MainActivity, DetailsActivity::class.java)
        button.setOnClickListener{
            val gson = Gson()
            val dataJson = gson.toJson(pokemon)
            intent.putExtra("Data", dataJson)
            startActivity(intent)

        }



    }

    private fun showData(pokemon: Pokemon) {
        val imageView: ImageView = findViewById(R.id.imageView)
        val name: TextView = findViewById(R.id.textName)
        Glide.with(this).load(pokemon.sprites.other.official_artwork.front_default).into(imageView);
        name.text = pokemon.name
    }
}
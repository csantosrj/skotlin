package com.example.skotlin.model.API

import com.example.skotlin.`interface`.Constant
import com.example.skotlin.`interface`.IPokemon
import com.example.skotlin.model.datamodel.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService : IPokemon {

    @GET(Constant.POKEMONS)
    fun getAllPokemon(): Call<Pokemon>

    @GET(Constant.POKEMON)
    fun getPokemonById(@Path("id") id: Int): Call<Pokemon>
}
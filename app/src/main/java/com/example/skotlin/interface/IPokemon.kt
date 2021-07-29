package com.example.skotlin.`interface`

import com.example.skotlin.model.datamodel.Pokemon

interface IPokemon {
    interface PokemonModel{
        fun getPokemonById(id: Int): Pokemon
        fun getPokemon(): List<Pokemon>
    }
}
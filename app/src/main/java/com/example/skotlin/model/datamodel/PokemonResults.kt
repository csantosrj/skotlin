package com.example.skotlin.model.datamodel

import com.google.gson.annotations.SerializedName

data class PokemonResults(
    @SerializedName("name") val name : String,
    @SerializedName("url") val url : String
)

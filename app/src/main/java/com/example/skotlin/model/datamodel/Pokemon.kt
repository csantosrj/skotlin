package com.example.skotlin.model.datamodel

import com.google.gson.annotations.SerializedName

data class Pokemon(

        @SerializedName("base_experience") val base_experience : String,
        @SerializedName("height") val height : Int,
        @SerializedName("name") val name : String,
        @SerializedName("sprites") val sprites : Sprites,
        @SerializedName("weight") val weight : Int,
        @SerializedName("types") val Types : List<Types>,

    )

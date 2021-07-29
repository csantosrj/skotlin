package com.example.skotlin.model.datamodel

import com.google.gson.annotations.SerializedName

data class Types(
    @SerializedName("slot") val slot : Int,
    @SerializedName("type") val type : Type,
)

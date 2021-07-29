package com.example.skotlin.model.datamodel

import com.google.gson.annotations.SerializedName

data class Sprites(
    @SerializedName("other") val other : Other,
)

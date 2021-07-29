package com.example.skotlin.model.datamodel

import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default") val front_default : String,
)

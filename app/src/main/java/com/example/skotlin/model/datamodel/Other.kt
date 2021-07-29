package com.example.skotlin.model.datamodel

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("official-artwork") val official_artwork : OfficialArtwork,
)

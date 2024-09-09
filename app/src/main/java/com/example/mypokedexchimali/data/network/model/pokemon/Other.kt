package com.example.mypokedexchimali.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream-world") val dreamWorld: DreamWorld,
    val home: Home,
    @SerializedName("official-artwork") val officialArtwork: OfficialArtwork,
    val showdown: Showdown
)
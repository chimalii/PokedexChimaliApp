package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream-world") val dreamWorld: com.example.mypokedexchimali.model.pokemon.DreamWorld,
    val home: com.example.mypokedexchimali.model.pokemon.Home,
    @SerializedName("official-artwork") val officialArtwork: com.example.mypokedexchimali.model.pokemon.OfficialArtwork,
    val showdown: com.example.mypokedexchimali.model.pokemon.Showdown
)
package com.example.mypokedexchimali.data.network.model

import com.google.gson.annotations.SerializedName

data class PokemonBase(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
)

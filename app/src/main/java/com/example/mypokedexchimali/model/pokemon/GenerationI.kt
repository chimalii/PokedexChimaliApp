package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue") val redBlue: com.example.mypokedexchimali.model.pokemon.RedBlue,
    val yellow: com.example.mypokedexchimali.model.pokemon.Yellow
)
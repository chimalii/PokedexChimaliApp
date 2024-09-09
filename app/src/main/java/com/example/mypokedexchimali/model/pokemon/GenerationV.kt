package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white") val blackWhite: com.example.mypokedexchimali.model.pokemon.BlackWhite
)
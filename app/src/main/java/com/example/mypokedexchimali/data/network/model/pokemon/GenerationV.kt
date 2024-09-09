package com.example.mypokedexchimali.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white") val blackWhite: BlackWhite
)
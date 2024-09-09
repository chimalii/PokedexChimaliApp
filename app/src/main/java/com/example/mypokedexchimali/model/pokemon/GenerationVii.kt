package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: com.example.mypokedexchimali.model.pokemon.Icons,
    @SerializedName("ultra-sun-ultra-moon") val ultraSunUltraMoon: com.example.mypokedexchimali.model.pokemon.UltraSunUltraMoon
)
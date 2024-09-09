package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: com.example.mypokedexchimali.model.pokemon.Emerald,
    @SerializedName("firered-leafgreen") val fireredLeafgreen: com.example.mypokedexchimali.model.pokemon.FireredLeafgreen,
    @SerializedName("ruby-sapphire") val rubySapphire: com.example.mypokedexchimali.model.pokemon.RubySapphire
)
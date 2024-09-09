package com.example.mypokedexchimali.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen") val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire") val rubySapphire: RubySapphire
)
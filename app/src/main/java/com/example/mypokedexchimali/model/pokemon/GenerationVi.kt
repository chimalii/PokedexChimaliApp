package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire") val omegarubyAlphasapphire: com.example.mypokedexchimali.model.pokemon.OmegarubyAlphasapphire,
    @SerializedName("x-y") val xY: com.example.mypokedexchimali.model.pokemon.XY
)
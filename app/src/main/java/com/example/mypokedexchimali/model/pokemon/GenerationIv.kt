package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl") val diamondPearl: com.example.mypokedexchimali.model.pokemon.DiamondPearl,
    @SerializedName("heartgold-soulsilver") val heartgoldSoulsilver: com.example.mypokedexchimali.model.pokemon.HeartgoldSoulsilver,
    val platinum: com.example.mypokedexchimali.model.pokemon.Platinum
)
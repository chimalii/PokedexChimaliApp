package com.example.mypokedexchimali.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl") val diamondPearl: DiamondPearl,
    @SerializedName("heartgold-soulsilver") val heartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)
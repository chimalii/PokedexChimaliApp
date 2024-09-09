package com.example.mypokedexchimali.model.pokemon

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i") val generationI: com.example.mypokedexchimali.model.pokemon.GenerationI,
    @SerializedName("generation-ii") val generationIi: com.example.mypokedexchimali.model.pokemon.GenerationIi,
    @SerializedName("generation-iii") val generationIii: com.example.mypokedexchimali.model.pokemon.GenerationIii,
    @SerializedName("generation-iv") val generationIv: com.example.mypokedexchimali.model.pokemon.GenerationIv,
    @SerializedName("generation-v")val generationV: com.example.mypokedexchimali.model.pokemon.GenerationV,
    @SerializedName("generation-vi")val generationVi: com.example.mypokedexchimali.model.pokemon.GenerationVi,
    @SerializedName("generation-vii")val generationVii: com.example.mypokedexchimali.model.pokemon.GenerationVii,
    @SerializedName("generation-viii")val generationViii: com.example.mypokedexchimali.model.pokemon.GenerationViii
)
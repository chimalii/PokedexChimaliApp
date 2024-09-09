package com.example.mypokedexchimali.model.pokemon

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.example.mypokedexchimali.model.pokemon.MoveLearnMethod,
    val version_group: com.example.mypokedexchimali.model.pokemon.VersionGroup
)
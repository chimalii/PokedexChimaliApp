package com.example.mypokedexchimali.domain

import com.example.mypokedexchimali.data.PokemonRepository
import com.example.mypokedexchimali.data.network.model.PokedexObject

class PokemonListRequirement {

    private val repository = PokemonRepository()

    suspend operator fun invoke(
        limit:Int
    ): PokedexObject? = repository.getPokemonList(limit)
}
package com.example.mypokedexchimali.domain

import com.example.mypokedexchimali.data.PokemonRepository
import com.example.mypokedexchimali.data.network.model.pokemon.Pokemon

class PokemonInfoRequirement {

    private val repository = PokemonRepository()

    suspend operator fun invoke(
        numberPokemon:Int
    ): Pokemon? = repository.getPokemonInfo(numberPokemon)
}
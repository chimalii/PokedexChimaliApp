package com.example.mypokedexchimali.data

import com.example.mypokedexchimali.data.network.NetworkModuleDI
import com.example.mypokedexchimali.data.network.PokemonApiClient
import com.example.mypokedexchimali.data.network.model.PokedexObject
import com.example.mypokedexchimali.data.network.PokemonAPIService
import com.example.mypokedexchimali.data.network.model.pokemon.Pokemon

class PokemonRepository() {
    private val apiPokemon = PokemonApiClient()

    suspend fun getPokemonList(limit:Int): PokedexObject? = apiPokemon.getPokemonList(limit)

    suspend fun getPokemonInfo(numberPokemon:Int): Pokemon?  = apiPokemon.getPokemonInfo(numberPokemon)
}
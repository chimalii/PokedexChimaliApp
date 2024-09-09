package com.example.mypokedexchimali.model

import com.example.mypokedexchimali.model.pokemon.Pokemon

class PokemonRepository() {
    private lateinit var api: PokemonAPIService

    suspend fun getPokemonList(limit:Int): PokedexObject?{
        api = NetworkModuleDI()
        return try{
            api.getPokemonList(limit)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }

    suspend fun getPokemonInfo(numberPokemon:Int): com.example.mypokedexchimali.model.pokemon.Pokemon? {
        api = NetworkModuleDI()
        return try{
            api.getPokemonInfo(numberPokemon)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}
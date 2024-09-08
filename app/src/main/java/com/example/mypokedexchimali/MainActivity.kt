package com.example.mypokedexchimali

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mypokedexchimali.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity:Activity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter : PokemonAdapter = PokemonAdapter()
    private lateinit var data:ArrayList<PokemonBase>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        // setUpRecyclerView(testData())
        getPokemonList()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //Función de prueba
    private fun testData():ArrayList<PokemonBase>{
        var result = ArrayList<PokemonBase>()

        result.add(PokemonBase("bulbasaur",""))
        result.add(PokemonBase("charmander",""))
        result.add(PokemonBase("squirtle",""))

        return result
    }

    //Función que obtiene pokemones con API
    private fun getPokemonList(){
        CoroutineScope(Dispatchers.IO).launch {
            val pokemonRepository = PokemonRepository()
            val result:PokedexObject? = pokemonRepository.getPokemonList(Constants.MAX_POKEMON_NUMBER)
            Log.d("Salida", result?.count.toString())
            CoroutineScope(Dispatchers.Main).launch {
                setUpRecyclerView(result?.results!!)
            }
        }
    }

    private fun setUpRecyclerView(dataForList:ArrayList<PokemonBase>){
        binding.RVPokemon.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVPokemon.layoutManager = linearLayoutManager
        adapter.PokemonAdapter(dataForList, this)
        binding.RVPokemon.adapter = adapter
    }

}
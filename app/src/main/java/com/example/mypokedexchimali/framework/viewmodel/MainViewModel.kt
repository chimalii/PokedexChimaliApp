package com.example.mypokedexchimali.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mypokedexchimali.data.network.model.PokedexObject
import com.example.mypokedexchimali.data.PokemonRepository
import com.example.mypokedexchimali.domain.PokemonListRequirement
import com.example.mypokedexchimali.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    // LiveData es un tipo de datos al cual nuestra MainActivity se
    // puede conectar para saber cuando hay un cambio en dicho modelo
    val pokedexObjectLiveData = MutableLiveData<PokedexObject>()
    private val pokemonListRequirement = PokemonListRequirement()

    fun getPokemonList(){
        viewModelScope.launch(Dispatchers.IO) {
            val result: PokedexObject? = pokemonListRequirement(Constants.MAX_POKEMON_NUMBER)
            Log.d("Salida", result?.count.toString())
            CoroutineScope(Dispatchers.Main).launch {
                pokedexObjectLiveData.postValue(result)
            }
        }
    }
}
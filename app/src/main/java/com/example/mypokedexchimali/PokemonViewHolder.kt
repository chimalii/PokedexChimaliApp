package com.example.mypokedexchimali

import android.content.Context
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.mypokedexchimali.databinding.ItemPokemonBinding
import com.example.mypokedexchimali.pokemon.Pokemon
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonViewHolder(private val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: PokemonBase, context: Context){
        binding.TVName.text = item.name
        getPokemonInfo(item.url,binding.IVPhoto,context)
    }
    private fun getPokemonInfo(url:String, imageView: ImageView, context:Context){
        //"https://pokeapi.co/api/v2/pokemon/23/"
        var pokemonStringNumber:String = url.replace("https://pokeapi.co/api/v2/pokemon/","")
        pokemonStringNumber = pokemonStringNumber.replace("/","")
        val pokemonNumber:Int = Integer.parseInt(pokemonStringNumber)

        CoroutineScope(Dispatchers.IO).launch {
            val pokemonRepository = PokemonRepository()
            val result: Pokemon? = pokemonRepository.getPokemonInfo(pokemonNumber)
            CoroutineScope(Dispatchers.Main).launch {
                val urlImage = result?.sprites?.other?.officialArtwork?.front_default.toString()

                val requestOptions =  RequestOptions()
                    .centerCrop()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .fitCenter()
                    .priority(Priority.HIGH)

                Glide.with(context).load(urlImage)
                    .apply(requestOptions)
                    .into(imageView)
            }
        }
    }
}
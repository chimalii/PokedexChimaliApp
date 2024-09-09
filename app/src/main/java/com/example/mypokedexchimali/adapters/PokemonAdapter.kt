package com.example.mypokedexchimali.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypokedexchimali.model.PokemonBase
import com.example.mypokedexchimali.adapters.viewholders.PokemonViewHolder
import com.example.mypokedexchimali.databinding.ItemPokemonBinding

class PokemonAdapter: RecyclerView.Adapter<PokemonViewHolder>() {
    //Variables globales
    var data:ArrayList<PokemonBase> = ArrayList()
    lateinit var context: Context

    fun PokemonAdapter(basicData : ArrayList<PokemonBase>, context:Context){
        this.data = basicData
        this.context = context
    }

    //Pinta cada celda
    //Viewholder: Conecta componentes de una celda con dato particular de la lista
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = data[position]
        //Pasar 'context' al médoto binf
        holder.bind(item, context)
    }
    //Indica qué layout utilizaremos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PokemonViewHolder(binding)
    }
    //Obtiene parámentros necesarios para reciclar las celdas/recursos
    override fun getItemCount(): Int {
        return data.size
    }
}
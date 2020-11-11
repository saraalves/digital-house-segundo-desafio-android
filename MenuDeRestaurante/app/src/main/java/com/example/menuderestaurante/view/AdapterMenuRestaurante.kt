package com.example.menuderestaurante.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.example.menuderestaurante.model.DescriptionPratos
import com.example.menuderestaurante.model.Menu

class AdapterMenuRestaurante(private val dataSet: List<DescriptionPratos>, private val listener: (DescriptionPratos) -> Unit):
    RecyclerView.Adapter<RestauranteViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_menu_restaurante,
                parent, false)

        return RestauranteViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }
}

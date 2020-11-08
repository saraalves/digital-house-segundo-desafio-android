package com.example.menuderestaurante.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.example.menuderestaurante.model.Menu

    class AdapterMenu (private val dataSet: List<Menu>):
    RecyclerView.Adapter<MenuViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_home, parent, false)

        return MenuViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { item }
    }

}
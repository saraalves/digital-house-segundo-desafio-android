package com.example.menuderestaurante.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.example.menuderestaurante.model.DescriptionPratos

class RestauranteViewHolder (private val view: View): RecyclerView.ViewHolder(view)  {
    private val imageView = view.findViewById<ImageView>(R.id.imageMenuRestaurante)
    private val txtDescriptionPrato = view.findViewById<TextView>(R.id.txtMenuRestaurante)

    fun bind (descriptionPratos: DescriptionPratos){
        txtDescriptionPrato.text = descriptionPratos.descricao
        imageView.setImageResource(descriptionPratos.image)
    }
}
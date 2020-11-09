package com.example.menuderestaurante.view

import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout_home.view.*

class MenuViewHolder (private val view: View): RecyclerView.ViewHolder(view) {
    private val imageView = view.findViewById<ImageView>(R.id.imageMenuHome)
    private val title = view.findViewById<TextView>(R.id.txtTitleMenuHome)
    private val txtAddress = view.findViewById<TextView>(R.id.txtAddressMenuHome)
    private val txtHour = view.findViewById<TextView>(R.id.txtHourMenuHome)

    fun bind (menu: com.example.menuderestaurante.model.Menu){
        title.text = menu.title
        txtAddress.text = menu.text
        txtHour.text = menu.hour

//        Picasso.get()
//            .load(menu.image)
//            .into(imageView)
    }
}
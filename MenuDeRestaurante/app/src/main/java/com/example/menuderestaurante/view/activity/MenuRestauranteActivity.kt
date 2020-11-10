package com.example.menuderestaurante.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.example.menuderestaurante.model.DescriptionPratos
import com.example.menuderestaurante.model.Menu
import com.example.menuderestaurante.view.AdapterMenu
import com.example.menuderestaurante.view.AdapterMenuRestaurante

class MenuRestauranteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_menu_restaurante)

        inflarMenuRestaurante()
    }

    private fun inflarMenuRestaurante() {
        val gridManager = GridLayoutManager(this, 2)
        val recyclerViewRestaurante = findViewById<RecyclerView>(R.id.recyclerMenuRestaurante)
        val adapterMenuRestaurante = AdapterMenuRestaurante(
            arrayListOf(
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    ""
                )
            )
        )

        recyclerViewRestaurante.apply {
            setHasFixedSize(true)
            layoutManager = gridManager
            adapter = adapterMenuRestaurante
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}
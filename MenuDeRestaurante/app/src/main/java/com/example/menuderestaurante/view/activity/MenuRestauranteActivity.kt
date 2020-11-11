package com.example.menuderestaurante.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
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

        goBack()
    }

    private fun goBack() {
        findViewById<ImageView>(R.id.imgViewBackRestaurante).setOnClickListener {
            onBackPressed()
        }
    }

    private fun inflarMenuRestaurante() {
        val gridManager = GridLayoutManager(this, 2)
        val recyclerViewRestaurante = findViewById<RecyclerView>(R.id.recyclerMenuRestaurante)
        val adapterMenuRestaurante = AdapterMenuRestaurante(
            arrayListOf(
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                ),
                DescriptionPratos(
                    "Salada com molho Gengibre ",
                    R.drawable.img_cafe_da_manha
                )
            )
        ) {
            val intent = Intent(this@MenuRestauranteActivity, DetalheMenuActivity::class.java)
            startActivity(intent)
        }

        recyclerViewRestaurante.apply {
            setHasFixedSize(true)
            layoutManager = gridManager
            adapter = adapterMenuRestaurante
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}
package com.example.menuderestaurante.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.example.menuderestaurante.model.Menu
import com.example.menuderestaurante.view.AdapterMenu

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        inflarMenuHome()

    }

    private fun inflarMenuHome() {
        val linearManager = LinearLayoutManager(this)
        val recyclerViewHome = findViewById<RecyclerView>(R.id.recyclerHome)
        val adapterMenuHome = adapterMenu()

        recyclerViewHome.apply {
            setHasFixedSize(true)
            layoutManager = linearManager
            adapter = adapterMenuHome
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }

    private fun adapterMenu(): AdapterMenu {
        val adapterMenuHome = AdapterMenu(
            arrayListOf(
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_cafe_da_manha
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_camarao
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_hamburguer
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_sushi
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_cafe_da_manha
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_camarao
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_sushi
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_cafe_da_manha
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_hamburguer
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_camarao
                ),
                Menu(
                    "Tony Roma's",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "Fecha às 22:00",
                    R.drawable.img_sushi
                )
            )
        ) {
            val intent = Intent(this@HomeActivity, MenuRestauranteActivity::class.java)
            startActivity(intent)
        }
        return adapterMenuHome
    }

}
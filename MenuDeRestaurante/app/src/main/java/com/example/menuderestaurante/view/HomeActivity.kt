package com.example.menuderestaurante.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menuderestaurante.R
import com.example.menuderestaurante.model.Menu

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val linearManager = LinearLayoutManager(this)
        val recyclerViewHome = findViewById<RecyclerView>(R.id.recyclerHome)
        val adapterMenuHome = AdapterMenu(arrayListOf(
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", "")
        ))

        recyclerViewHome.apply {
            setHasFixedSize(true)
            layoutManager = linearManager
            adapter = adapterMenuHome
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

    }

//    fun inflarMenu(menu: List<Menu>) {
//        val linearManager = LinearLayoutManager(this)
//        val recyclerViewHome = findViewById<RecyclerView>(R.id.recyclerHome)
//        val adapterMenuHome = AdapterMenu(arrayListOf(
//            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
//            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", ""),
//            Menu("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", "")
//        ))
//
//        recyclerViewHome.apply {
//            setHasFixedSize(true)
//            layoutManager = linearManager
//            adapter = adapterMenuHome
//            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
//        }
//
//    }
}
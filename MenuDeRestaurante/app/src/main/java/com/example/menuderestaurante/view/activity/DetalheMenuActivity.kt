package com.example.menuderestaurante.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import com.example.menuderestaurante.R
import kotlinx.android.synthetic.main.activity_detalhe_menu.*

class DetalheMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_detalhe_menu)

        goBack()
    }

    private fun goBack() {
        findViewById<ImageView>(R.id.imageBackDetalhe).setOnClickListener {
            onBackPressed()
        }
    }
}
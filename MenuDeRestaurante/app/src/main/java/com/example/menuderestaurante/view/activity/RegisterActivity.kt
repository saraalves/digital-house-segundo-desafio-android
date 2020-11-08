package com.example.menuderestaurante.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.menuderestaurante.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<Button>(R.id.btnLoginRegister).setOnClickListener{
            intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
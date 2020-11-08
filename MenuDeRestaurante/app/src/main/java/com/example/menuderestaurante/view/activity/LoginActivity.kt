package com.example.menuderestaurante.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.menuderestaurante.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        navigationToHome()
        navigationToRegister()
    }

    fun navigationToHome() {
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun navigationToRegister() {
        findViewById<Button>(R.id.btnRegisterLogin).setOnClickListener {
            intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
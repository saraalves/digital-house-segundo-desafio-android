package com.example.menuderestaurante.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import com.example.menuderestaurante.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        navigationToHome()
        navigationToRegister()
        verifyFieldEmail()
        verifyFieldPassword()
    }

    private fun verifyFieldPassword() {
        findViewById<TextInputEditText>(R.id.edtPasswordLogin).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextInputLayout>(R.id.txtPasswordLogin).error = ""
            }
        })
    }

    private fun verifyFieldEmail() {
        findViewById<TextInputEditText>(R.id.edtEmailLogin).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextInputLayout>(R.id.txtEmailLogin).error = ""
            }
        })
    }

    private fun navigationToHome() {
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            if (validarEntrada()) {
                intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun navigationToRegister() {
        findViewById<Button>(R.id.btnRegisterLogin).setOnClickListener {
            intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validarEntrada(): Boolean {
        var resultado = true

        val edtEmailLogin = findViewById<TextInputEditText>(R.id.edtEmailLogin)
        val edtPasswordLogin = findViewById<TextInputEditText>(R.id.edtPasswordLogin)

        if (edtEmailLogin.text?.trim()!!.isBlank()) {
            findViewById<TextInputLayout>(R.id.txtEmailLogin).error = "Username Vazio"
            resultado = false
        }

        if (edtPasswordLogin.text?.trim()!!.isBlank()) {
            findViewById<TextInputLayout>(R.id.txtPasswordLogin).error = "Password Vazio"
            resultado = false
        }

        return resultado
    }
}
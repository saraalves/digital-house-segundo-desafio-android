package com.example.menuderestaurante.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.example.menuderestaurante.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        navigationToLogin()
        verifyFieldEmail()
        verifyFieldPassword()
        verifyFieldName()
        verifyFieldRepeatPassword()
    }

    private fun navigationToLogin() {
        findViewById<Button>(R.id.btnLoginRegister).setOnClickListener {
            if(validarEntrada()){
                intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun verifyFieldPassword() {
        findViewById<TextInputEditText>(R.id.edtPasswordRegister).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextInputLayout>(R.id.txtPasswordRegister).error = ""
            }
        })
    }

    private fun verifyFieldEmail() {
        findViewById<TextInputEditText>(R.id.edtEmailRegister).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextInputLayout>(R.id.txtEmailRegister).error = ""
            }
        })
    }

    private fun verifyFieldName() {
        findViewById<TextInputEditText>(R.id.edtNameRegister).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextInputLayout>(R.id.txtNameRegister).error = ""
            }
        })
    }

    private fun verifyFieldRepeatPassword() {
        findViewById<TextInputEditText>(R.id.edtRepeatPasswordRegister).addTextChangedListener(object :
            TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextInputLayout>(R.id.txtRepeatPasswordRegister).error = ""
            }
        })
    }

    fun validarEntrada(): Boolean {
        var resultado = true

        val edtNameRegister = findViewById<TextInputEditText>(R.id.edtNameRegister)
        val edtEmailRegister = findViewById<TextInputEditText>(R.id.edtEmailRegister)
        val edtPasswordRegister = findViewById<TextInputEditText>(R.id.edtPasswordRegister)
        val edtRepeatPasswordRegister = findViewById<TextInputEditText>(R.id.edtRepeatPasswordRegister)

        if (edtNameRegister.text?.trim()!!.isBlank()) {
            findViewById<TextInputLayout>(R.id.txtNameRegister).error = "Username vazio"
            resultado = false
        }

        if (edtEmailRegister.text?.trim()!!.isBlank()) {
            findViewById<TextInputLayout>(R.id.txtEmailRegister).error = "Username vazio"
            resultado = false
        }

        if (edtPasswordRegister.text?.trim()!!.isBlank()) {
            findViewById<TextInputLayout>(R.id.txtPasswordRegister).error = "Password vazio"
            resultado = false
        }

        if(edtRepeatPasswordRegister.text?.trim()!!.isBlank()){
            findViewById<TextInputLayout>(R.id.txtRepeatPasswordRegister).error = "Password vazio"
            resultado = false
        }

//        if(edtRepeatPasswordRegister != edtPasswordRegister){
//            findViewById<TextInputLayout>(R.id.txtRepeatPasswordRegister).error = "As senhas devem ser iguais"
//            resultado = false
//
//        }

        return resultado
    }


}
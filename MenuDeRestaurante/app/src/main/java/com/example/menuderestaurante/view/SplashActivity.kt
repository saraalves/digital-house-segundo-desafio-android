package com.example.menuderestaurante.view

import android.app.ActionBar
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.Window.FEATURE_NO_TITLE
import android.view.WindowInsets
import android.view.WindowManager
import com.example.menuderestaurante.R

const val DURACAO_DO_SPLASH = 4000L // L de Long

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, DURACAO_DO_SPLASH)
    }

}
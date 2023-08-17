package com.example.mad_app085_p4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val ihome = Intent(this, MainActivity::class.java)
            startActivity(ihome)
            finish() // Close the splash activity
        }, 4000)
    }
}
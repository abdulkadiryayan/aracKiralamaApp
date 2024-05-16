package com.example.arackiralamauygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class BaslangicEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic_ekrani)
        Handler().postDelayed({
            var gecis = Intent(this, MainActivity::class.java  )
            startActivity(gecis)
            finish()

        },3000)
    }
}
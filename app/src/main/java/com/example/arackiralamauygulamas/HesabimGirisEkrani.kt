package com.example.arackiralamauygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HesabimGirisEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hesabim_giris_ekrani)


        val uyeOlmaButonu1 = findViewById<Button>(R.id.uyeol)
        uyeOlmaButonu1.setOnClickListener(View.OnClickListener {
            val uyeOlmaButonu2 = Intent(this,HesabimUyeOlmaEkrani::class.java)
            startActivity(uyeOlmaButonu2)

        })



       /* val uyeOlmaButonu = findViewById<Button>(R.id.uyeol)
        uyeOlmaButonu.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,uyeOlmaButonu::class.java)
            startActivity(intent)

        }) */

      /*  val hesapGirisEkranii = findViewById<Button>(R.id.hesap)
        hesapGirisEkranii.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,HesabimGirisEkrani::class.java)
            startActivity(intent) */
    }
}
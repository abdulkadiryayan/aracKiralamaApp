package com.example.arackiralamauygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class diger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diger)


        val hakkimizdaGir = findViewById<Button>(R.id.hakkimizda)
        hakkimizdaGir.setOnClickListener({
            val intent = Intent(this,hakimizda::class.java)
            startActivity(intent)
        })

        val iletisimGir = findViewById<Button>(R.id.iletisim)
        iletisimGir.setOnClickListener({
            val iletgir = Intent(this,iletisim::class.java)
            startActivity(iletgir)

        })

        val gizlilikGir = findViewById<Button>(R.id.Gsozlesmesi)
        gizlilikGir.setOnClickListener({
            val gizGir = Intent(this,gizlilikSozlesmesi::class.java)
            startActivity(gizGir)
        })

        val kvkk1 = findViewById<Button>(R.id.kvkk)
        kvkk1.setOnClickListener({
            val kvkkGir = Intent(this,kisiselVerilerinKorunmasi::class.java)
            startActivity(kvkkGir)
        })


        val kkosulu = findViewById<Button>(R.id.kullanimkosulu)
        kkosulu.setOnClickListener({
            val kkGir = Intent(this,KullanimKosullari::class.java)
            startActivity(kkGir)
        })

        val blogg = findViewById<Button>(R.id.blog)
        blogg.setOnClickListener({
            val blogGir = Intent(this,Blog::class.java)
            startActivity(blogGir)
        })

        val TvReklam = findViewById<Button>(R.id.button14)
        TvReklam.setOnClickListener({
            val tvGir = Intent(this,Tv_Reklamlari::class.java)
            startActivity(tvGir)
        })

        val uygulamaBilgisi = findViewById<Button>(R.id.info)
        uygulamaBilgisi.setOnClickListener({
            val uGir = Intent(this,UygulamaBilgileri::class.java)
            startActivity(uGir)
        })

    }
}
package com.example.arackiralamauygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.arackiralamauygulamas.databinding.ActivityHesabimUyeOlmaEkraniBinding

class HesabimUyeOlmaEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hesabim_uye_olma_ekrani)

      //  val binding = ActivityHesabimUyeOlmaEkraniBinding.inflate(LayoutInflater)


        val context = this
        var db = DataBaseHelper(context)
      //  val inflater = LayoutInflater.from(context)
        val inflater = layoutInflater
        val binding = ActivityHesabimUyeOlmaEkraniBinding.inflate(inflater)

        setContentView(binding.root)
        binding.uyeol1.setOnClickListener {
            var etisimsoyisim = binding.isim.text.toString()
            var etsifre = binding.sifre.text.toString()
            var etkullaniciAdi = binding.nickname.text.toString()
            var etTCNO = binding.tcno.text.toString()
            var etdTarihi = binding.BDate.text.toString()
            var etemail = binding.email.text.toString()
            var ettelno = binding.phoneN.text.toString()
            if(etisimsoyisim.isNotEmpty() && etsifre.isNotEmpty() && etkullaniciAdi.isNotEmpty() && etTCNO.isNotEmpty() && etdTarihi.isNotEmpty() && etemail.isNotEmpty() && ettelno.isNotEmpty()){
                var kullanici = User(etisimsoyisim,etsifre.toInt(),etkullaniciAdi,etTCNO.toInt(),etdTarihi,etemail,ettelno.toInt())
                db.insertData(kullanici)
            }
            else{
                Toast.makeText(applicationContext,"lütfen boş alanları doldurun", Toast.LENGTH_LONG).show()

            }


        }


    }

}
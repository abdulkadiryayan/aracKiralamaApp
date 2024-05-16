package com.example.arackiralamauygulamas

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val database_name = " veritabani "
val table_name = "kullanicilar"
val col_id = "kullanici_id"
val col_name = "adisoyadi"
val col_sifre = "sifre"
val col_kullaniciAdi = "kullaniciAdı"
val col_TCNO = " TCNO"
val col_dTarihi =  " dTarihi "
val col_email = " email "
val col_telefonNumarasi = "telefonNo"


class DataBaseHelper (var context: Context):SQLiteOpenHelper(context, database_name,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {


        val createTable= " CREATE TABLE " + table_name+"("+
                col_id + " INTEGER PRIMARY KEY,"+
                col_name + " VARCHAR(256),"+
                col_sifre + " VARCHAR(256),"+
                col_kullaniciAdi + " VARCHAR(256),"+
                col_TCNO + " VARCHAR(15),"+
                col_dTarihi + " VARCHAR(256),"+
                col_email + " VARCHAR(256),"+
                col_telefonNumarasi + " VARCHAR(20),"

        db?.execSQL(createTable)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {


    }

    fun insertData(user: User){
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(col_name,user.nameAndSurname)
        cv.put(col_sifre,user.sifre)
        cv.put(col_kullaniciAdi,user.kullaniciAdi)
        cv.put(col_TCNO,user.TCNO)
        cv.put(col_dTarihi,user.dTarihi)
        cv.put(col_email,user.email)
        cv.put(col_telefonNumarasi,user.telNumarasi)

        var sonuc = db.insert(table_name,null,cv)
        if(sonuc == (-1).toLong()){
            Toast.makeText(context,"hatalı", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context,"eklendi", Toast.LENGTH_LONG).show()
        }


    }

}

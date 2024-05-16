package com.example.arackiralamauygulamas

class User{
    val id : Int = 0
    var nameAndSurname : String =""
    var sifre : Int = 0
    var kullaniciAdi : String = ""
    var TCNO : Int = 0
    var dTarihi : String = ""
    var email : String = ""
    var telNumarasi : Int = 0

    constructor(
        nameAndSurname:String, sifre:Int,
        kullaniciAdi:String, TCNO:Int, dTarihi:String, email:String, telNumarasi: Int
    ){
        this.nameAndSurname = nameAndSurname
        this.sifre = sifre
        this.kullaniciAdi = kullaniciAdi
        this.TCNO = TCNO
        this.dTarihi= dTarihi
        this.email = email
        this.telNumarasi = telNumarasi
    }

    constructor(){

    }

 }


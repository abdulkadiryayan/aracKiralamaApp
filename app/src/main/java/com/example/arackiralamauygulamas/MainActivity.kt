package com.example.arackiralamauygulamas

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var dateButton: Button
    private lateinit var timeButton: Button
    private lateinit var selectedDateTimeTextView: TextView

    private lateinit var calendar: Calendar
    private lateinit var dateFormat: SimpleDateFormat
    private lateinit var timeFormat: SimpleDateFormat

    private var selectedDate: Date? = null
    private var selectedTime: Date? = null

    private lateinit var citiesButton: Button

    private val cities = arrayOf(
        "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya",
        "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur",
        "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne",
        "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane",
        "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu",
        "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya",
        "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu",
        "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat",
        "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak",
        "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın",
        "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        citiesButton = findViewById(R.id.alisyeri)

        citiesButton.setOnClickListener {
            displayCities()
        }




        val hesapGirisEkranii = findViewById<Button>(R.id.hesap)
        hesapGirisEkranii.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,HesabimGirisEkrani::class.java)
            startActivity(intent)


        })

        val dier = findViewById<Button>(R.id.diger)
        dier.setOnClickListener(View.OnClickListener {
            val dier1 = Intent(this,diger::class.java)
            startActivity(dier1)

        })


        dateButton = findViewById(R.id.dateButton)
        timeButton = findViewById(R.id.timeButton)
       // selectedDateTimeTextView = findViewById(R.id.selectedDateTimeTextView)

        calendar = Calendar.getInstance()
        dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

        dateButton.setOnClickListener { showDatePickerDialog() }
        timeButton.setOnClickListener { showTimePickerDialog() }
    }

    private fun displayCities() {
        val cityList = StringBuilder()
        for (city in cities) {
            cityList.append(city).append("\n")
        }
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Türkiye'nin İlleri")
        dialogBuilder.setMessage(cityList.toString())
        dialogBuilder.setPositiveButton("Tamam") { dialog, _ ->
            dialog.dismiss()
        }
        val alertDialog = dialogBuilder.create()
        alertDialog.show()
    }

    private fun showDatePickerDialog() {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { _: DatePicker, selectedYear: Int, monthOfYear: Int, dayOfMonth: Int ->
                calendar.set(selectedYear, monthOfYear, dayOfMonth)
                selectedDate = calendar.time
                updateSelectedDateTimeText()
            }, year, month, day)

        datePickerDialog.show()
    }

    private fun showTimePickerDialog() {
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(this,
            TimePickerDialog.OnTimeSetListener { _: TimePicker, selectedHour: Int, selectedMinute: Int ->
                calendar.set(Calendar.HOUR_OF_DAY, selectedHour)
                calendar.set(Calendar.MINUTE, selectedMinute)
                selectedTime = calendar.time
                updateSelectedDateTimeText()
            }, hour, minute, true)

        timePickerDialog.show()
    }

    private fun updateSelectedDateTimeText() {
        val selectedDateTime = StringBuilder()

        if (selectedDate != null) {
            selectedDateTime.append("Seçiliş Tarih: ${dateFormat.format(selectedDate)}")
        }

        if (selectedTime != null) {
            selectedDateTime.append(" Saat: ${timeFormat.format(selectedTime)}")
        }

        selectedDateTimeTextView.text = selectedDateTime.toString()


























  /*      // Veritabanı bağlantısını oluşturun
        val dbHelper = DBHelper(this)
        val userList = DBHelper.getAllUsers()

        // Veri ekleme
        val kullaniciButonu = findViewById<Button>(R.id.ara)
        kullaniciButonu.setOnClickListener({
            val dbHelper = DBHelper(this)
            val user = User(1, "abdulkadir yayan", 12345, "abdulkadiryayan", 243432, "10.2.2222", "ayayan@gmail.com", 58374423)
            dbHelper.addUser(user)

        })


        for (user in userList) {
            Log.d("User Info", "ID: ${user.id}, Name: ${user.name}, Email: ${user.email}")
        }

*/






        /*    val hesapGirisEkraniDiger = findViewById<Button>(R.id.diger)
                    hesapGirisEkraniDiger.setOnClickListener {
                        val diger1 = Intent(applicationContext, diger::class.java)
                        startActivity(diger1)
                    } */

     /*   val hesapUyeOlmaEkraniEkrani = findViewById<Button>(R.id.uyeol)
        hesapUyeOlmaEkraniEkrani.setOnClickListener(View.OnClickListener {
            val üyeOlma = Intent(this, HesabimUyeOlmaEkrani::class.java)
            startActivity(üyeOlma)

        })*/
        /*  val uyeOlmaButonu = findViewById<Button>(R.id.uyeol)
                      uyeOlmaButonu.setOnClickListener(View.OnClickListener {
                          val uyeoll = Intent(this,uyeOlmaButonu::class.java)
                          startActivity(uyeoll)

                      }) */


        /*   val uyeOlmaButonu = findViewById<Button>(R.id.uyeol1)
           uyeOlmaButonu.setOnClickListener(View.OnClickListener {
               val intent = Intent(this,uyeOlmaButonu::class.java)
               startActivity(intent)  */


    }


}



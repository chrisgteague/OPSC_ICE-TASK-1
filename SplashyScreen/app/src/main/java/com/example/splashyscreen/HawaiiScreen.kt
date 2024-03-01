package com.example.splashyscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HawaiiScreen : AppCompatActivity() {

    private lateinit var indonesiaButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hawaii_screen)

        indonesiaButton = findViewById(R.id.idBtn)

        indonesiaButton.setOnClickListener{
            var indonesiaIntent = Intent(this, IndonesiaScreen::class.java)
            startActivity(indonesiaIntent)
        }
    }
}
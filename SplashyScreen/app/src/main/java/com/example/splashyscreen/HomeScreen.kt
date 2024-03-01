package com.example.splashyscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {

    private lateinit var japanButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        japanButton = findViewById(R.id.jpBtn)

        japanButton.setOnClickListener{
            var japanIntent = Intent(this, JapanScreen::class.java)
            startActivity(japanIntent)
        }
    }
}
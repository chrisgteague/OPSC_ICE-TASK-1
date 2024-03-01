package com.example.splashyscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IndonesiaScreen : AppCompatActivity() {

    private lateinit var swedishButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indonesia_screen)

        swedishButton = findViewById(R.id.swedishBtn)

        swedishButton.setOnClickListener{
            var backIntent = Intent(this, SwedenScreen::class.java)
            startActivity(backIntent)
        }
    }
}
package com.example.splashyscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IrishScreen : AppCompatActivity() {

    private lateinit var hawaiiButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_irish_screen)

        hawaiiButton = findViewById(R.id.hawaiiBtn)

        hawaiiButton.setOnClickListener{
            var hawaiiIntent = Intent(this, HawaiiScreen::class.java)
            startActivity(hawaiiIntent)
        }
    }
}
package com.example.splashyscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SwedenScreen : AppCompatActivity() {

    private lateinit var backButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweden_screen)

        backButton = findViewById(R.id.backBtn)

        backButton.setOnClickListener{
            var backIntent = Intent(this, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}
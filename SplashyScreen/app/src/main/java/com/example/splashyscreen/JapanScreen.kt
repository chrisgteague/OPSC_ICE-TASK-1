package com.example.splashyscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JapanScreen : AppCompatActivity() {

    private lateinit var irishButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_japan_screen)

        irishButton = findViewById(R.id.irishBtn)

        irishButton.setOnClickListener{
            var irishIntent = Intent(this, IrishScreen::class.java)
            startActivity(irishIntent)
        }
    }
}
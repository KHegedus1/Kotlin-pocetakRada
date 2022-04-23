package com.example.prvaaplikacijakh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCLick = findViewById<Button>(R.id.myButton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var
        btnCLick.setOnClickListener{
            btnCLick.text="Pozdrav,klik2"
            tvMyTextView.text ="Klik2,pozdrav"
        }

    }
    }
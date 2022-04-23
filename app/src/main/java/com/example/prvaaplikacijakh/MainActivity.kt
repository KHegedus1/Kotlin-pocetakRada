package com.example.prvaaplikacijakh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCLick = findViewById<Button>(R.id.myButton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesCLicked = 0
        btnCLick.setOnClickListener{
                timesCLicked = timesCLicked +1
                tvMyTextView.text = timesCLicked .toString()
            Toast.makeText(this, "Pozz" , Toast.LENGTH_LONG).show()
        }

    }
    }
package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val i = Intent(this, ar25::class.java)
            startActivity(i)
        }
        button2.setOnClickListener {
            val i = Intent(this, AR35::class.java)
            startActivity(i)
        }
        button3.setOnClickListener {
            val i = Intent(this, AR45::class.java)
            startActivity(i)
        }
        button4.setOnClickListener {
            val i = Intent(this, AR55::class.java)
            startActivity(i)
        }
    }
}
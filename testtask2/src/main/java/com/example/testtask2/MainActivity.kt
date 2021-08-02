package com.example.testtask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val MESSAGE_KEY = "1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val message = findViewById<EditText>(R.id.editText).text.toString()
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(MESSAGE_KEY, message)
        }
        startActivity(intent)
    }
}
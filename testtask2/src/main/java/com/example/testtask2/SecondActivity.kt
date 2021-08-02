package com.example.testtask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra(MESSAGE_KEY)
        findViewById<TextView>(R.id.receivedText).apply {
            text = message
        }
    }

    fun onClick(view: View){
        Toast.makeText(applicationContext, intent.getStringExtra(MESSAGE_KEY), Toast.LENGTH_SHORT).show()
    }
}
package com.example.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Actionbar
        actionBar()
        //handlingClicks
        handlingClicks()
    }

    private fun handlingClicks() {
        findViewById<Button>(R.id.btToTextViewActivity).setOnClickListener {
           val intent = Intent(this,TextView::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btToEditTextActivity).setOnClickListener {
            val intent = Intent(this,EditText::class.java)
            startActivity(intent)
        }
    }

    private fun actionBar(){
        supportActionBar?.hide()
    }
}
package com.example.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.views.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        //Actionbar
        actionBar()
        //handlingClicks
        handlingClicks()
    }

    private fun handlingClicks() {
        binding.btToTextViewActivity.setOnClickListener {
           val intent = Intent(this,TextView::class.java)
            startActivity(intent)
        }
       binding.btToEditTextActivity.setOnClickListener {
            val intent = Intent(this,EditText::class.java)
            startActivity(intent)
        }
        binding.btToImageViewActivity.setOnClickListener{
            val intent = Intent(this,ImageView::class.java)
            startActivity(intent)
        }
        binding.btToListViewActivity.setOnClickListener{
            val intent = Intent(this,ListView::class.java)
            startActivity(intent)
        }
        binding.btToCustomListViewActivity.setOnClickListener {
            val intent = Intent(this,CustomListView::class.java)
            startActivity(intent)
        }
    }

    private fun actionBar(){
        supportActionBar?.hide()
    }
}
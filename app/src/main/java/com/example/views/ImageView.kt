package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.views.databinding.ActivityImageViewBinding

class ImageView : AppCompatActivity() {
    private lateinit var binding: ActivityImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        var root = binding.root
        setContentView(root)
        //Handling Clicks
        handlingClicks()
        //ActionBar
        actonBar()
    }

    private fun actonBar() {
        supportActionBar?.hide()
    }

    private fun handlingClicks() {

    }
}
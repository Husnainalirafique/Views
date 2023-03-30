package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.views.databinding.ActivityCustomListViewBinding
import com.example.views.databinding.ActivityListViewBinding

class CustomListView : AppCompatActivity() {
    private lateinit var binding : ActivityCustomListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomListViewBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        //functions
        actionBar()
        clicks()
    }

    private fun clicks() {

    }
    private fun actionBar() {
        supportActionBar?.hide()
    }
}
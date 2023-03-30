package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.views.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        //functions
        actionBar()
        clicks()
        listViewAndClicks()
    }

    private fun listViewAndClicks() {
        val items = mutableListOf<String>("c++", "kotlin", "java","html","css","js","web","Android")
        binding.userList.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        //click for each list view item
        binding.userList.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(applicationContext, selectedItem, Toast.LENGTH_SHORT).show()
        }
    }

    private fun clicks() {

    }

    private fun actionBar() {
        supportActionBar?.hide()
    }
}
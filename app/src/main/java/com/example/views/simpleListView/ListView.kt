package com.example.views.simpleListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_view)
        //functions
        actionBar()
        clicks()
        listViewAndClicks()
    }

    private fun listViewAndClicks() {
        val items = arrayOf("c++", "kotlin", "java", "html", "css", "js", "web", "Android")
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
        binding.userList.adapter = arrayAdapter

        binding.userList.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, selectedItem, Toast.LENGTH_SHORT).show()
        }
    }

    private fun clicks() {

    }

    private fun actionBar() {
        supportActionBar?.hide()
    }
}
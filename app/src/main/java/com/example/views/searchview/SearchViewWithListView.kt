package com.example.views.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.customListViewUser.MyAdapter
import com.example.views.customListViewUser.User
import com.example.views.databinding.ActivitySearchViewWithListViewBinding

class SearchViewWithListView : AppCompatActivity() {
    private lateinit var binding: ActivitySearchViewWithListViewBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search_view_with_list_view)
        supportActionBar?.hide()
        searchView()
    }

    private fun searchView() {
        val data = listOf("Alice","Ben","Claire","David","Emily","Frank","Grace","Henry","Isabella","Jack","Katie", "Liam", "Maria", "Nathan", "Olivia", "Peter", "Quinn", "Rachel", "Samuel", "Thomas", "Ursula", "Victoria", "William", "Xander", "Yara", "Zachary")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        binding.svListView.adapter = adapter
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                adapter.filter.filter(query)
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return true
            }
        })
    }
}

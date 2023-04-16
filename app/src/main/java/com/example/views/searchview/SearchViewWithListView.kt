package com.example.views.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.databinding.ActivitySearchViewWithListViewBinding

class SearchViewWithListView : AppCompatActivity() {
     private lateinit var binding: ActivitySearchViewWithListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search_view_with_list_view)
    }
}

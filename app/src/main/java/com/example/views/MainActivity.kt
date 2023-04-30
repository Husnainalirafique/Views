package com.example.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.views.bottomNavigation.BottomNavigation
import com.example.views.cardView.CardView
import com.example.views.customListViewUser.CustomListView
import com.example.views.databinding.ActivityMainBinding
import com.example.views.editText.EditText
import com.example.views.gridView.customGridViewArrayAdapter.GridView
import com.example.views.gridView.customGridViewArrayAdapter.ShowUserData
import com.example.views.imageView.ImageView
import com.example.views.scrollView.NestedScrollView
import com.example.views.scrollView.ScrollView
import com.example.views.searchview.SearchViewWithListView
import com.example.views.simpleListView.ListView
import com.example.views.textView.TextView
import com.example.views.webview.WebView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Actionbar
        actionBar()
        //handlingClicks
        handlingClicks()
    }

    private fun handlingClicks() {
        binding.btToTextViewActivity.setOnClickListener {
            startActivity( Intent(this, TextView::class.java))
        }
        binding.btToEditTextActivity.setOnClickListener {
            startActivity( Intent(this, EditText::class.java))
        }
        binding.btToImageViewActivity.setOnClickListener {
            startActivity(Intent(this, ImageView::class.java))
        }
        binding.btToListViewActivity.setOnClickListener {
            startActivity(Intent(this, ListView::class.java))
        }
        binding.btToCustomListViewActivity.setOnClickListener {
            startActivity(Intent(this, CustomListView::class.java))
        }
        binding.btToScrollViewActivity.setOnClickListener {
            startActivity(Intent(this, ScrollView::class.java))
        }
        binding.btToNestedScrollViewActivity.setOnClickListener {
            startActivity(Intent(this, NestedScrollView::class.java))
        }
        binding.btToCardViewActivity.setOnClickListener {
            startActivity(Intent(this, CardView::class.java))
        }
        binding.btToGridViewActivity.setOnClickListener {
            startActivity(Intent(this, GridView::class.java))
        }
        binding.btToWebViewActivity.setOnClickListener {
            startActivity(Intent(this, WebView::class.java))
        }
        binding.btToSearchViewActivity.setOnClickListener {
            startActivity(Intent(this, SearchViewWithListView::class.java))
        }
        binding.btToBottomNavigationViewActivity.setOnClickListener {
            startActivity(Intent(this, BottomNavigation::class.java))
        }
    }

    private fun actionBar() {
        supportActionBar?.hide()
    }
}
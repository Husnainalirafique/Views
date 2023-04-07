package com.example.views.gridView.customGridViewArrayAdapter

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.databinding.ActivityShowUserDataBinding

class ShowUserData : AppCompatActivity() {
    private lateinit var binding: ActivityShowUserDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_show_user_data)
        //actionbar
        actionbar()
        //clicks
        clicks()
    }

    private fun clicks() {
        binding.imageView.setImageResource(intent.getIntExtra("imageResId",0))
        binding.textView.text = intent.getStringExtra("text")
    }

    private fun actionbar() {
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            title = "Profile"
            setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(applicationContext,
                R.color.my_toolbar_color
            )))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
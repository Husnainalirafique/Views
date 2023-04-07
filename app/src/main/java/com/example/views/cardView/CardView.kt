package com.example.views.cardView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.databinding.ActivityCardViewBinding
import com.example.views.databinding.ActivityMainBinding

class CardView : AppCompatActivity() {
    private lateinit var binding: ActivityCardViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_card_view)
        supportActionBar?.hide()

        clicks()
    }

    private fun clicks() {
        binding.cardView.setOnClickListener {
            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
        }
    }
}
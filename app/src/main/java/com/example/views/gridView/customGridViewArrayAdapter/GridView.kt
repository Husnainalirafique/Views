package com.example.views.gridView.customGridViewArrayAdapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.databinding.ActivityGridViewBinding

class GridView : AppCompatActivity() {
    private lateinit var binding: ActivityGridViewBinding
    private lateinit var arrayList: ArrayList<SimpleGridViewData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_grid_view)

        //handling grid view call
        gridView()
        //handling clicks
        profileIntent()
    }

    private fun profileIntent() {
        binding.simpleGridView.setOnItemClickListener { _, _, position, _ ->

            val clickedItemImage = arrayList[position].simpleGridViewDataImg
            val clickedItemText = arrayList[position].simpleGridViewDataName

            val intent = Intent(this, ShowUserData::class.java)
            intent.putExtra("imageResId", clickedItemImage)
            intent.putExtra("text", clickedItemText)
            startActivity(intent)
        }

    }

    private fun gridView() {
        arrayList = ArrayList()
        arrayList.add(SimpleGridViewData(R.drawable.p1, "Husnain"))
        arrayList.add(SimpleGridViewData(R.drawable.p2, "Danish"))
        arrayList.add(SimpleGridViewData(R.drawable.p3, "Usama"))
        arrayList.add(SimpleGridViewData(R.drawable.p4, "Adeel"))
        arrayList.add(SimpleGridViewData(R.drawable.p5, "Hamza"))
        binding.simpleGridView.adapter = SimpleGridViewAdapter(this, arrayList)
    }
}
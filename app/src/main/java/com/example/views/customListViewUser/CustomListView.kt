package com.example.views.customListViewUser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.views.R
import com.example.views.databinding.ActivityCustomListViewBinding
import com.example.views.gridView.customGridViewArrayAdapter.ShowUserData

class CustomListView : AppCompatActivity() {
    private lateinit var binding: ActivityCustomListViewBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_list_view)
        //functions
        actionBar()
        //Custom ListView
        customListView()
    }

    private fun customListView() {
        userArrayList = ArrayList()
        userArrayList.apply{
            add(User("Husnain", "Test. Is this working?", "7:00 pm", R.drawable.p1))
            add(User("Danish", "Dummy text. Please ignore.", "7:00 pm", R.drawable.p2))
            add(User("Adeel", "Testing, 1 2 3. Have a good day!", "7:00 pm", R.drawable.p3))
            add(User("Hamza", "New phone test. Disregard. Thanks!", "7:00 pm", R.drawable.p4))
            add(User("Usama", "Test message. Please ignore.", "7:00 pm", R.drawable.p5))
        }
        val listview = binding.customListView
        listview.adapter = MyAdapter(this, userArrayList)
        listview.setOnItemClickListener { parent, view, position, id ->
            val clickedItemImageView = view.findViewById<ImageView>(R.id.profile_pic)
            val clickedItemTextView = view.findViewById<TextView>(R.id.user_name)
            val clickedItemImageResId = userArrayList[position].imgId
            val clickedItemText = clickedItemTextView.text.toString()

            val intent = Intent(this, ShowUserData::class.java)
            intent.putExtra("imageResId", clickedItemImageResId)
            intent.putExtra("text", clickedItemText)
            startActivity(intent)
        }
    }

    private fun actionBar() {
        supportActionBar?.hide()
        val window = window
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
    }

}
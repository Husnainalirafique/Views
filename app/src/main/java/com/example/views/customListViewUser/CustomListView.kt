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
        val imageId =
            intArrayOf(R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5)
        val userName =
            arrayOf("Husnain", "Danish", "Usama", "Ali", "Hamza")
        val lastMsg = arrayOf(
            "Test. Is this working?",
            "Dummy text. Please ignore.",
            "Testing, 1 2 3. Have a good day!",
            "New phone test. Disregard. Thanks!",
            "Test message. Please ignore."
        )
        val lastMsgTime = arrayOf("7:00 pm", "7:00 pm", "7:00 pm", "7:00 pm", "7:00 pm")

        userArrayList = ArrayList()
        for (i in userName.indices) {
            val user = User(userName[i], lastMsg[i], lastMsgTime[i], imageId[i])
            userArrayList.add(user)
        }
        binding.customListView.adapter = MyAdapter(this, userArrayList)

        binding.customListView.setOnItemClickListener { parent, view, position, id ->
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
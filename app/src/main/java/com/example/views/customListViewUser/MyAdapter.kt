package com.example.views.customListViewUser

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.views.R

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>
        (context, R.layout.custom_list_item, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        LayoutInflater.from(context)
        val view = LayoutInflater.from(context).inflate(R.layout.custom_list_item,null)

        val imageView = view.findViewById<android.widget.ImageView>(R.id.profile_pic)
        val userName = view.findViewById<TextView>(R.id.user_name)
        val lastSms = view.findViewById<TextView>(R.id.last_sms)
        val lastSmsTime = view.findViewById<TextView>(R.id.time)

        imageView.setImageResource(arrayList[position].imgId)
        userName.text = arrayList[position].name
        lastSms.text = arrayList[position].lastMessage
        lastSmsTime.text = arrayList[position].lastMsgTime

        return view
    }
}
package com.example.views.gridView.customGridViewArrayAdapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.views.R

class SimpleGridViewAdapter(
    private val context: Activity,
    private val arrayList: ArrayList<SimpleGridViewData>
) : ArrayAdapter<SimpleGridViewData>(
    context,
    R.layout.simple_grid_item,
    arrayList
) {
    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(R.layout.simple_grid_item, null)

        val simpleGridViewAdapterImg: ImageView = view.findViewById(R.id.simple_grid_view_img)
        val simpleGridViewAdapterText: TextView = view.findViewById(R.id.simple_grid_view_text)

        val itemPosition = arrayList[position]
        simpleGridViewAdapterImg.setImageResource(itemPosition.simpleGridViewDataImg)
        simpleGridViewAdapterText.text = itemPosition.simpleGridViewDataName

        return view
    }
}
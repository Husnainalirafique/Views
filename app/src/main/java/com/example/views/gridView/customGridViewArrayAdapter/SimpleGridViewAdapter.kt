package com.example.views.gridView.customGridViewArrayAdapter

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
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val viewHolder: ViewHolder

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.simple_grid_item, parent,false)
            viewHolder = ViewHolder(itemView)
            if (itemView != null) {
                itemView.tag = viewHolder
            }
        } else {
            viewHolder = itemView.tag as ViewHolder
        }

        val itemPosition = arrayList[position]
        viewHolder.img.setImageResource(itemPosition.simpleGridViewDataImg)
        viewHolder.txt.text = itemPosition.simpleGridViewDataName
        return itemView!!
    }

    private class ViewHolder(view: View) {
        val img: ImageView = view.findViewById(R.id.simple_grid_view_img)
        val txt: TextView = view.findViewById(R.id.simple_grid_view_text)
    }
}



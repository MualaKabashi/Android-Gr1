package com.cacttus.android_gr1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cacttus.android_gr1.R
import com.cacttus.android_gr1.models.Singer

class SingerAdapter(private var context: Context, var list: List<Singer>) : BaseAdapter() {
    var layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, contextView: View?, parent: ViewGroup?): View {
        var rowView = layoutInflater.inflate(R.layout.complex_list_item, parent, false)

        var singerPhoto = rowView.findViewById<ImageView>(R.id.item_image)
        var singerName = rowView.findViewById<TextView>(R.id.item_name)
        var singerAge = rowView.findViewById<TextView>(R.id.item_age)

        singerPhoto.setImageResource(list[position].photo)
        singerName.text = list[position].name
        singerAge.text = list[position].age.toString()

        return rowView
    }
}
package com.example.kotlinandroid_p10_customlistview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Dima on 18.03.2018.
 */
class MyListAdapter
(var mCtx: Context, var resource: Int, var items: List<Hero>)

    : ArrayAdapter<Hero>(mCtx, resource, items) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource, null)

        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView: TextView = view.findViewById(R.id.textView)

//        imageView.setImageResource(items.get(position).image)
//        textView.text = items.get(position).name



        val hero: Hero = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(hero.image))
        textView.text = hero.name



        return view
    }
}
package com.example.kotlinandroid_p10_customlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

/*
* Lesson
* https://www.youtube.com/watch?v=3nYKWz1kk6s&index=10&list=PLk7v1Z2rk4hj2rnU4Lcjs1GFw6Nqt-tlW
* */

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val list = mutableListOf<Hero>()

        list.add(Hero(R.drawable.hero1, "Droid"))
        list.add(Hero(R.drawable.hero2, "Spider-Man"))
        list.add(Hero(R.drawable.hero3, "Thor"))
        list.add(Hero(R.drawable.hero4, "Pantera"))
        list.add(Hero(R.drawable.hero5, "Rider"))

        val adapter: MyListAdapter = MyListAdapter(this, R.layout.my_list_item, list)

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, list.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }
}

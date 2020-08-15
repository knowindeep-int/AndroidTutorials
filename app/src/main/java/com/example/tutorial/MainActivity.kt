package com.example.tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val list = mutableListOf<Int>()
        for (i in 0..20)
            list.add(i)

        recyclerView.apply {
            adapter = MyAdapter(list, this@MainActivity)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

}
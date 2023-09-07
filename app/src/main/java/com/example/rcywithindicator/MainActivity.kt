package com.example.rcywithindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        with(recyclerView) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = DemoAdapter()
            addItemDecoration(
                DotsIndicatorDecoration(
                    colorInactive = ContextCompat.getColor(context, R.color.grey),
                    colorActive = ContextCompat.getColor(context, R.color.green)
                )
            )
        }
    }
}
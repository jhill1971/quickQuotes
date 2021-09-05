package com.example.quickquotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // lateinit guarantees that these will be initialized later
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: QuoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // These lines connect the recycler view widget to the
        // Layout manager and attach an adapter for the data to
        // be displayed.
        layoutManager = LinearLayoutManager(this)
        //this refers to the current object of that class
        RecyclerView.layoutManager = layoutManager

        adapter = QuoteAdapter()
        RecyclerView.adapter = adapter
    }
}
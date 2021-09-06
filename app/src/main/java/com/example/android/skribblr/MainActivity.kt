package com.example.android.skribblr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.android.skribblr.adapter.RecyclerViewAdapter
import com.example.android.skribblr.data.DataSource
import com.example.android.skribblr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView=binding.recyclerView
        recyclerView.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val note = "Wash hands"
        val list=DataSource(note).skribblList()
        val adapter=RecyclerViewAdapter(this,list)
        recyclerView.adapter=adapter

        binding.fab.setOnClickListener {
            setContentView(R.layout.fragment_new_skribbl)
        }
    }
}

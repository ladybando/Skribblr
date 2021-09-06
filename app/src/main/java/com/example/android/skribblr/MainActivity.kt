package com.example.android.skribblr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.android.skribblr.adapter.RecyclerViewAdapter
import com.example.android.skribblr.data.DataSource
import com.example.android.skribblr.databinding.ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView=binding.recyclerView
        recyclerView.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val TAG="MainActivity"
        val note = "Wash hands"
        val list=DataSource(note).skribblList()
        val adapter=SkribblrAdapter(this,list)
        recyclerView.adapter=adapter

        binding.textInLayout.visibility=View.INVISIBLE

        //TODO refactor after navigation lesson to use fragment

        binding.fab.setOnClickListener {
            binding.textInLayout.visibility=View.VISIBLE

            binding.submitButton.setOnClickListener {
                val inputString=binding.editText.text.toString()
                list.add(inputString)
                Log.d(TAG, inputString)
                adapter.notifyItemInserted(0)
                binding.editText.text.clear()
            }

          // setContentView(R.layout.fragment_new_skribbl)
        }
    }
}

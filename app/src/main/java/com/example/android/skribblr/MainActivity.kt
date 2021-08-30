package com.example.android.skribblr

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import com.example.android.stickies.adapter.SkribblAdapter
import com.example.android.stickies.data.DataSource
import com.example.android.stickies.data.Skribbl
import com.example.android.stickies.databinding.ActivityListBinding
import com.example.android.stickies.databinding.ActivityMainBinding
import com.example.android.stickies.databinding.AddNewActivityBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listBinding = ActivityListBinding.inflate(layoutInflater)
        val mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val addNewActivityBinding = AddNewActivityBinding.inflate(layoutInflater)

        setContentView(mainBinding.root)
        //load data
        val resources = resources
        val myDataset = DataSource().skribblsList(resources)

        //access views
        val recyclerView = mainBinding.recyclerView
        recyclerView.adapter = SkribblAdapter(this, myDataset)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val adapter=SkribblAdapter(this,myDataset)

        mainBinding.fab.setOnClickListener {
            val inputSkribbl = addNewActivityBinding.addNewSkribblField.text.toString()
            myDataset.add(Skribbl("", Date(), inputSkribbl, "HIGH"))
            adapter.notifyItemInserted(0)
        }

        mainBinding.editNewSkribbl.setOnClickListener {
            val inputSkribbl = mainBinding.editNewSkribbl.text.toString()
            
            mainBinding.submitButton.setOnClickListener {
                myDataset.add(Skribbl("", Date(), inputSkribbl, "MEDIUM"))
                adapter.notifyItemInserted(0)
            }
        }
    }
}

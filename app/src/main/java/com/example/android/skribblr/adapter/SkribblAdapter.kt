package com.example.android.skribblr.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.skribblr.R

class SkribblrAdapter(context: Context, val dataset:MutableList<String>) : RecyclerView.Adapter<SkribblrAdapter.SkribblrViewHolder>() {

    //two by two grid list?
    //clickable to edit and/or delete
    //clicking opens to edit
    //long click to delete
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkribblrViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return SkribblrViewHolder(view)
    }

    override fun onBindViewHolder(holder: SkribblrViewHolder, position: Int) {
        holder.textView.text = dataset[position]
    }

    override fun getItemCount(): Int = dataset.size


    class SkribblrViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.skribbl_text_view)
    }
}

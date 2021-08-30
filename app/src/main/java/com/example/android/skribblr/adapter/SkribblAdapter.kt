package com.example.android.skribblr.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.stickies.R
import com.example.android.stickies.data.Skribbl

class SkribblAdapter(private val context: Context, private val dataset: MutableList<Skribbl>) : RecyclerView.Adapter<SkribblAdapter.SkribblViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkribblViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false)
        return SkribblViewHolder(view)
    }


    override fun onBindViewHolder(holder: SkribblViewHolder, position: Int) {
        val skribblItem= dataset[position]
        holder.skribblTextView.text = skribblItem.note
        holder.itemView.setOnLongClickListener{
            when (skribblItem.urgency) {
                "LOW" -> {
                    holder.skribblTextView.resources.getDrawable(R.drawable.ic_low_priority)
                }
                "MEDIUM" -> {
                    holder.skribblTextView.resources.getDrawable(R.drawable.ic_medium_priority)
                }
                else -> {
                    holder.skribblTextView.resources.getDrawable(R.drawable.ic_priority_high)
                }
            }
            notifyItemRemoved(position)
            true
        }

    }

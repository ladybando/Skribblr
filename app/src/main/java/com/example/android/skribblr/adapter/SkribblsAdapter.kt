package com.example.android.skribblr.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.skribblr.R
import com.example.android.skribblr.data.Skribbl
import com.example.android.skribblr.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class SkribblsAdapter(private val onClick: (Skribbl) -> Unit) :
    ListAdapter<Skribbl, SkribblsAdapter.SkribblsViewHolder>(SkribblDiffCallback) {

    class SkribblsViewHolder(view: View, val onCLick: (Skribbl) -> Unit) :
        RecyclerView.ViewHolder(view) {
        private val skribTextView: TextView = view.findViewById(R.id.task_text)
        private var currentSkribbl: Skribbl? = null

        init {
            skribTextView.setOnClickListener {
                currentSkribbl?.let {
                    onCLick(it)
                }
            }
        }
        fun bind(skribbl: Skribbl){
            currentSkribbl = skribbl
            skribTextView.text=skribbl.note
            val skribTitle = view.findViewById<TextInputEditText>(R.id.add_skribbl_name)
            if(skribTitle != null){
                skribTitle.text = getString(R.string.add_skribbl_name)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SkribblsAdapter.SkribblsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.a)
    }

    override fun onBindViewHolder(holder: SkribblsAdapter.SkribblsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

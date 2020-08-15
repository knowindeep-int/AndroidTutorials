package com.example.tutorial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val list: List<Int>, private val context: Context, private val listener: onClick): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false)
        return ViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder)
            holder.bind(list[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val textView: TextView = itemView.findViewById(R.id.itemTextView)

        fun bind(item: Int) {
            textView.text = item.toString()

            itemView.setOnClickListener {
                listener.cardClick(adapterPosition)
            }
        }

    }

    interface onClick {
        fun cardClick(position: Int)
    }
}
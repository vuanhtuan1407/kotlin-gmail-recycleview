package com.example.recyclerviewgmailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ItemAdapter(val items: ArrayList<ItemModel>): RecyclerView.Adapter<ItemAdapter.RVItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.email_item, parent, false)
        return RVItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RVItemViewHolder, position: Int) {
        holder.title.text = items[position].title
        holder.time.text = items[position].time
        holder.body.text = items[position].body
        holder.check.isChecked = items[position].selected
    }

    class RVItemViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: TextView
        val time: TextView
        val body: TextView
        val check: CheckBox
        init {
            title = itemView.findViewById(R.id.title)
            time = itemView.findViewById(R.id.time)
            body = itemView.findViewById(R.id.body)
            check = itemView.findViewById(R.id.checkBox)
        }
    }
}
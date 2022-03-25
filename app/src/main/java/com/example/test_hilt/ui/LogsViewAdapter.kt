package com.example.test_hilt.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.entities.Log
import com.example.test_hilt.R

//import com.example.test_hilt.data.entities.Log

class LogsViewAdapter() : ListAdapter<Log, LogsViewAdapter.LogViewHolder>(DiffCallback()) {

    inner class LogViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val txt: TextView = itemView.findViewById(R.id.text)

        @SuppressLint("SetTextI18n")
        fun bind(item: Log) {
            txt.text =  "${item.msg}\n ${item.times}}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return LogViewHolder(view)
    }

    override fun onBindViewHolder(holder: LogViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class DiffCallback: DiffUtil.ItemCallback<Log>() {
        override fun areItemsTheSame(oldItem: Log, newItem: Log): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Log, newItem: Log): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
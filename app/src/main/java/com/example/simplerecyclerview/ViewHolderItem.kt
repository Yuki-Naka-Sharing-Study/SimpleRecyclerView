package com.example.simplerecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderItem(itemView: View): RecyclerView.ViewHolder(itemView) {
    // View(xml)の方から、指定のidを見つけてくる(ここではtv)
    val itemName: TextView = itemView.findViewById(R.id.tv)
}
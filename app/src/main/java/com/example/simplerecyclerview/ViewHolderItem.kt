package com.example.simplerecyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewHolderItem(itemView: View): RecyclerView.ViewHolder(itemView) {
    // View(xml)の方から、指定のidを見つけてくる(ここではtv)
    val itemName: TextView = itemView.findViewById(R.id.tv)
    // クリック処理(1行分の画面(view)が押されたら~)
    private val recyclerAdapter = RecyclerAdapter()
    private val animalList = recyclerAdapter.animalList

    init {
        itemView.setOnClickListener {
            val position:Int = adapterPosition

            Toast.makeText(itemView.context, animalList[position], Toast.LENGTH_SHORT).show()
        }
    }

}
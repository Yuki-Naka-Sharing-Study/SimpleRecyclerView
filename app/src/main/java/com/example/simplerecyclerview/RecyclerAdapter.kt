package com.example.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter :RecyclerView.Adapter<ViewHolderItem>() {
    // 表示するリストを用意
    private val animalList = listOf(
        "ライオン","クマ","キリン","ゾウ","パンダ","コアラ","サル","ヒョウ","ウサギ", "ゴリラ",
        "カバ","カピバラ","リス","ワニ","イルカ","ヒツジ","ネコ","ラッコ","カメ","クジラ"
    )

    // ここで１行分のレイアウト(View)を生成
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout, parent, false)

        return ViewHolderItem(itemXml)
    }

    // position番目のデータをレイアウト(xml)に表示するようセット
    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.itemName.text = animalList[position]
    }

    // データが何件あるかをカウントする
//    override fun getItemCount(): Int {
//        return animalList.size
//    }

    override fun getItemCount(): Int = animalList.size


}
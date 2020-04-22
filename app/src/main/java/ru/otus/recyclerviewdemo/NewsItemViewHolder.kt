package ru.otus.recyclerviewdemo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleTv: TextView = itemView.findViewById(R.id.titleTv)
    val subtitleTv: TextView = itemView.findViewById(R.id.subtitleTv)
    val imgIv: ImageView = itemView.findViewById(R.id.image)

    fun bind(item: NewsItem) {
        titleTv.text = item.title
        subtitleTv.text = item.subtitle
        imgIv.setBackgroundColor(item.color)
    }
}
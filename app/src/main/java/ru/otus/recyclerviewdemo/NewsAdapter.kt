package ru.otus.recyclerviewdemo

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val inflater: LayoutInflater, val items: List<NewsItem>) : RecyclerView.Adapter<NewsItemViewHolder>() {
    companion object {
        const val TAG = "NEWS_ADAPTER"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViewHolder {
        Log.d(TAG, "onCreateViewHolder: $viewType")
        return NewsItemViewHolder(inflater.inflate(R.layout.item_news, parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: $position")
        holder.bind(items[position])
    }
}
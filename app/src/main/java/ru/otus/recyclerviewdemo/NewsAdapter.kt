package ru.otus.recyclerviewdemo

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val inflater: LayoutInflater, val items: List<NewsItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val TAG = "NEWS_ADAPTER"

        const val VIEW_TYPE_HEADER = 0
        const val VIEW_TYPE_ITEM = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        Log.d(TAG, "onCreateViewHolder: $viewType")
        return if (viewType == VIEW_TYPE_ITEM) {
            NewsItemViewHolder(inflater.inflate(R.layout.item_news, parent, false))
        } else {
            HeaderItemViewHolder(inflater.inflate(R.layout.item_news_header, parent, false))
        }
    }

    override fun getItemCount() = items.size + 1 // + 1 = header

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: $position")
        if (holder is NewsItemViewHolder) {
            holder.bind(items[position - 1])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) VIEW_TYPE_HEADER else VIEW_TYPE_ITEM
    }
}
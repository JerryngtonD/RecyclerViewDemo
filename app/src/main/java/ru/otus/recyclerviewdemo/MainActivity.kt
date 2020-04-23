package ru.otus.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val items = mutableListOf(
        NewsItem("Заголовк 1", "подзаголовк 1", Color.RED),
        NewsItem("Заголовк 2", "подзаголовк 2", Color.BLACK),
        NewsItem("Заголовк 3", "подзаголовк 3", Color.BLUE),

        NewsItem("Заголовк 4", "подзаголовк 4", Color.CYAN),
        NewsItem("Заголовк 5", "подзаголовк 5", Color.DKGRAY),
        NewsItem("Заголовк 6", "подзаголовк 6", Color.GRAY),

        NewsItem("Заголовк 7", "подзаголовк 7", Color.GREEN),
        NewsItem("Заголовк 8", "подзаголовк 8", Color.LTGRAY),
        NewsItem("Заголовк 9", "подзаголовк 9", Color.MAGENTA),

        NewsItem("Заголовк 10", "подзаголовк 10", Color.RED),
        NewsItem("Заголовк 11", "подзаголовк 11", Color.BLUE),
        NewsItem("Заголовк 12", "подзаголовк 12", Color.MAGENTA),

        NewsItem("Заголовк 13", "подзаголовк 13", Color.LTGRAY),
        NewsItem("Заголовк 14", "подзаголовк 14", Color.YELLOW),
        NewsItem("Заголовк 15", "подзаголовк 15", Color.GREEN),

        NewsItem("Заголовк 16", "подзаголовк 16", Color.RED),
        NewsItem("Заголовк 17", "подзаголовк 17", Color.LTGRAY),
        NewsItem("Заголовк 18", "подзаголовк 18", Color.BLACK),

        NewsItem("Заголовк 19", "подзаголовк 19", Color.WHITE),
        NewsItem("Заголовк 20", "подзаголовк 20", Color.GREEN),
        NewsItem("Заголовк 21", "подзаголовк 21", Color.RED)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler() {
        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.layoutManager = layoutManager
        recycler.adapter = NewsAdapter(LayoutInflater.from(this), items)
    }
}

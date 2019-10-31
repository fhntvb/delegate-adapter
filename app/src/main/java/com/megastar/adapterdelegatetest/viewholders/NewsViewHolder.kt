package com.megastar.adapterdelegatetest.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_four.view.*
import kotlinx.android.synthetic.main.item_one.view.*

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val newsTitleTextView = itemView.newsTitleTextView as TextView
    val newsBodyTextView = itemView.newsBodyTextView as TextView
}
package com.megastar.adapterdelegatetest.delegates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megastar.adapterdelegatetest.data.AdapterItem
import com.megastar.adapterdelegatetest.data.AdapterTypes
import com.megastar.adapterdelegatetest.ImageLoader
import com.megastar.adapterdelegatetest.R
import com.megastar.adapterdelegatetest.data.NewsModel
import com.megastar.adapterdelegatetest.library.AdapterDelegate
import com.megastar.adapterdelegatetest.viewholders.AnimalViewHolder
import com.megastar.adapterdelegatetest.viewholders.NewsViewHolder

class NewsDelegate: AdapterDelegate<NewsModel, AdapterItem>(
    AdapterTypes.NEWS
) {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_four,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: NewsModel) {
        holder as NewsViewHolder
        with(holder) {
            newsTitleTextView.text = item.newsTitle
            newsBodyTextView.text = item.newsBody
        }
    }
}
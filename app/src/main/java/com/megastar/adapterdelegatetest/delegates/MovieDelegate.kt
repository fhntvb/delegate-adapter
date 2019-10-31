package com.megastar.adapterdelegatetest.delegates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megastar.adapterdelegatetest.data.AdapterItem
import com.megastar.adapterdelegatetest.data.AdapterTypes
import com.megastar.adapterdelegatetest.R
import com.megastar.adapterdelegatetest.data.MovieModel
import com.megastar.adapterdelegatetest.library.AdapterDelegate
import com.megastar.adapterdelegatetest.viewholders.MovieViewHolder

class MovieDelegate: AdapterDelegate<MovieModel, AdapterItem>(
    AdapterTypes.MOVIE
) {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_two,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: MovieModel) {
        holder as MovieViewHolder
        with(holder) {
            movieName.text = item.movieName
            ratingBar.rating = item.rating
        }
    }
}
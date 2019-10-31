package com.megastar.adapterdelegatetest.viewholders

import android.view.View
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_one.view.*
import kotlinx.android.synthetic.main.item_one.view.nameTextView
import kotlinx.android.synthetic.main.item_two.view.*

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val movieName = itemView.nameTextView as TextView
    val ratingBar = itemView.ratingBar as RatingBar
}
package com.megastar.adapterdelegatetest.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_one.view.*

class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val animalName = itemView.nameTextView as TextView
    val imageView = itemView.imageView as ImageView
}
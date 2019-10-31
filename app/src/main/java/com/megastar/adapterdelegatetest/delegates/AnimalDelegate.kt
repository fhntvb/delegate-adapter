package com.megastar.adapterdelegatetest.delegates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megastar.adapterdelegatetest.data.AdapterItem
import com.megastar.adapterdelegatetest.data.AdapterTypes
import com.megastar.adapterdelegatetest.ImageLoader
import com.megastar.adapterdelegatetest.R
import com.megastar.adapterdelegatetest.data.AnimalModel
import com.megastar.adapterdelegatetest.library.AdapterDelegate
import com.megastar.adapterdelegatetest.viewholders.AnimalViewHolder

class AnimalDelegate: AdapterDelegate<AnimalModel, AdapterItem>(
    AdapterTypes.ANIMAL
) {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return AnimalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_one,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: AnimalModel) {
        holder as AnimalViewHolder
        with(holder) {
            animalName.text = item.animalName
            ImageLoader.loadImage(imageView,item.url)
        }
    }
}
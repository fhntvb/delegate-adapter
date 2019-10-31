package com.megastar.adapterdelegatetest.delegates

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megastar.adapterdelegatetest.data.AdapterItem
import com.megastar.adapterdelegatetest.data.AdapterTypes
import com.megastar.adapterdelegatetest.R
import com.megastar.adapterdelegatetest.data.ColorModel
import com.megastar.adapterdelegatetest.library.AdapterDelegate
import com.megastar.adapterdelegatetest.viewholders.ColorViewHolder

class ColorDelegate: AdapterDelegate<ColorModel, AdapterItem>(
    AdapterTypes.COLOR
) {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return ColorViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_three,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ColorModel) {
        holder as ColorViewHolder
        with(holder) {
            colorName.text = item.colorName
            seekBar.setOnSeekBarChangeListener(holder.onSeekBarChangeListener)
            seekBar.progress = item.color

        }
    }
}
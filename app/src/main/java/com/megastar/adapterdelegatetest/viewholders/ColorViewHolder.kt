package com.megastar.adapterdelegatetest.viewholders

import android.graphics.Color
import android.os.Build
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_three.view.*

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val root = itemView.root as ConstraintLayout
    val colorName = itemView.nameTextView as TextView
    val seekBar = itemView.seekBar as SeekBar

    val onSeekBarChangeListener = object : SeekBar.OnSeekBarChangeListener {
        @RequiresApi(Build.VERSION_CODES.O)
        override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            root.setBackgroundColor(Color.argb(255, p1 / 2, p1 * 2, p1))
        }

        override fun onStartTrackingTouch(p0: SeekBar?) {
        }

        override fun onStopTrackingTouch(p0: SeekBar?) {
        }
    }
}
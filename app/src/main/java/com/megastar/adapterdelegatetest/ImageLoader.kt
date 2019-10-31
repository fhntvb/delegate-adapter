package com.megastar.adapterdelegatetest

import android.annotation.SuppressLint
import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

@SuppressLint("StaticFieldLeak")
object ImageLoader {
    private lateinit var context: Context

    fun init(mainApplication: MainApplication) {
        context = mainApplication
    }

    fun loadImage(imageView: ImageView, url: String) {
        Glide.with(context)
            .load(url)
            .into(imageView)
    }
}
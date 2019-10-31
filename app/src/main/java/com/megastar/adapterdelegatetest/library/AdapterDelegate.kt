package com.megastar.adapterdelegatetest.library

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

/**
 * @param itemType  view type
 * */

@Suppress("UNCHECKED_CAST")
abstract class AdapterDelegate<T ,K> (val itemType: Int) {

    abstract fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder


    fun onBindViewHolderOriginal(holder: RecyclerView.ViewHolder, item: K) {
        val newItem  = item as T
        onBindViewHolder(holder, newItem)
    }


    abstract fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: T)
}


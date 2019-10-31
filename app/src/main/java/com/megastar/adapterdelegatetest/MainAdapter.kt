package com.megastar.adapterdelegatetest

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megastar.adapterdelegatetest.data.AdapterItem
import com.megastar.adapterdelegatetest.delegates.AnimalDelegate
import com.megastar.adapterdelegatetest.delegates.ColorDelegate
import com.megastar.adapterdelegatetest.delegates.MovieDelegate
import com.megastar.adapterdelegatetest.delegates.NewsDelegate
import com.megastar.adapterdelegatetest.library.AdapterDelegateManager

class MainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items = mutableListOf<AdapterItem>()
    var adapterDelegateManager: AdapterDelegateManager<AdapterItem> = AdapterDelegateManager()

    init {
        adapterDelegateManager.addDelegate(AnimalDelegate())
        adapterDelegateManager.addDelegate(MovieDelegate())
        adapterDelegateManager.addDelegate(ColorDelegate())
        adapterDelegateManager.addDelegate(NewsDelegate())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return adapterDelegateManager.createViewHolderForViewType(parent, viewType)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        adapterDelegateManager.bindViewHolderForViewType(holder,holder.itemViewType,items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].getViewType()
    }
}
package com.megastar.adapterdelegatetest.library

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterDelegateManager<K>(private val delegateList: MutableList<AdapterDelegate<*, K>>) {

    constructor() : this(arrayListOf<AdapterDelegate<*, K>>())

    fun createViewHolderForViewType(parent: ViewGroup, itemType: Int): RecyclerView.ViewHolder {
        return getDelegateForItemType(itemType).onCreateViewHolder(parent)
    }

    private fun getDelegateForItemType(itemType: Int): AdapterDelegate<*, K> {
        return delegateList.find { it.itemType == itemType }!!
    }

    fun bindViewHolderForViewType(holder: RecyclerView.ViewHolder, itemType: Int, item: K) {
        getDelegateForItemType(itemType).onBindViewHolderOriginal(holder, item)
    }

    fun addDelegate(delegate: AdapterDelegate<*, K>) {
        delegateList.add(delegate)
    }

    fun removeAllDelegates() {
        delegateList.clear()
    }

    fun removeDelegate(delegate: AdapterDelegate<*, K>) {
        delegateList.remove(delegate)
    }

    fun removeDelegateForViewType(viewType: Int) {
        delegateList.remove(getDelegateForItemType(viewType))
    }

}
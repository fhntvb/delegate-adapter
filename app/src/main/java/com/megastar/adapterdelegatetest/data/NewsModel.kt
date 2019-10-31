package com.megastar.adapterdelegatetest.data

data class NewsModel(val newsTitle: String, val newsBody: String) :
    AdapterItem {
    override fun getViewType(): Int {
        return AdapterTypes.NEWS
    }
}
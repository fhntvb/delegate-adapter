package com.megastar.adapterdelegatetest.data

data class MovieModel(val movieName: String,var rating: Float):
    AdapterItem {
    override fun getViewType(): Int {
        return AdapterTypes.MOVIE
    }
}
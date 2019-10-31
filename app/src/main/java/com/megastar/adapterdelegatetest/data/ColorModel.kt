package com.megastar.adapterdelegatetest.data

data class ColorModel(val colorName: String,var color: Int):
    AdapterItem {
    override fun getViewType(): Int {
        return AdapterTypes.COLOR
    }
}
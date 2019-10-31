package com.megastar.adapterdelegatetest.data

data class AnimalModel(val animalName: String, val url: String) :
    AdapterItem {
    override fun getViewType(): Int {
        return AdapterTypes.ANIMAL
    }
}
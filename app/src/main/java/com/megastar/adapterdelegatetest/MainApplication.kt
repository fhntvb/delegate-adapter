package com.megastar.adapterdelegatetest

import android.app.Application

class MainApplication: Application() {

    override fun onCreate() {
        ImageLoader.init(this)
    }
}
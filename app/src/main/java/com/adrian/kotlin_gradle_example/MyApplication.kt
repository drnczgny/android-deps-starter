package com.adrian.kotlin_gradle_example

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.fluttercode.datafactory.impl.DataFactory
import timber.log.Timber

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        AndroidThreeTen.init(this)
    }
}

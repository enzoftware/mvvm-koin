package com.projects.enzoftware.cryptotracker

import android.app.Application
import com.projects.enzoftware.cryptotracker.di.applicationModule
import com.projects.enzoftware.cryptotracker.di.browseModule
import com.projects.enzoftware.cryptotracker.utils.TimberLogger
import org.koin.android.ext.android.startKoin

class KoinApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(applicationModule, browseModule),
                loadProperties = true, // TO READ THE koin.properties file located in assets
                logger = TimberLogger())
    }
}
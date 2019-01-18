package com.projects.enzoftware.cryptotracker

import android.app.Application
import com.projects.enzoftware.cryptotracker.di.applicationModule
import org.koin.android.ext.android.startKoin

class KoinApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(applicationModule))
    }
}
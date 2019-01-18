package com.projects.enzoftware.cryptotracker.di

import com.google.gson.Gson
import com.projects.enzoftware.cryptotracker.data.DataRepository
import com.projects.enzoftware.cryptotracker.data.DataRepositoryImpl
import com.projects.enzoftware.cryptotracker.ui.CurrenciesAdapter
import org.koin.dsl.module.module

val applicationModule = module {
    single { Gson() }
    factory { CurrenciesAdapter() }
    factory<DataRepository> { DataRepositoryImpl(get()) }
}
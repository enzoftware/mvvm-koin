package com.projects.enzoftware.cryptotracker.di

import com.google.gson.Gson
import com.projects.enzoftware.cryptotracker.data.DataRepository
import com.projects.enzoftware.cryptotracker.data.DataRepositoryFactory
import com.projects.enzoftware.cryptotracker.data.LocalDataRepository
import com.projects.enzoftware.cryptotracker.data.RemoteDataRepository
import com.projects.enzoftware.cryptotracker.ui.CurrenciesAdapter
import com.projects.enzoftware.cryptotracker.utils.UrlHelper
import com.projects.enzoftware.cryptotracker.viewmodel.CurrencyViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val applicationModule = module {
    single { Gson() }

    factory<DataRepository>("local") { LocalDataRepository(get()) }
    factory<DataRepository>("remote") { RemoteDataRepository() }
    factory { DataRepositoryFactory(get("local"), get("remote")) }
    single { UrlHelper(getProperty("currency_api_base_url")) }

}

val browseModule = module("browse") {
    factory { CurrenciesAdapter() }
    viewModel { (json: String) -> CurrencyViewModel(get(), json) }
}
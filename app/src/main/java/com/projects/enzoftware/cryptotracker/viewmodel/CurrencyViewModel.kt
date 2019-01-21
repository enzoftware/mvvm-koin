package com.projects.enzoftware.cryptotracker.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.projects.enzoftware.cryptotracker.data.DataRepositoryFactory
import com.projects.enzoftware.cryptotracker.model.Currency

class CurrencyViewModel constructor(val dataRepositoryFactory: DataRepositoryFactory,
                                    val json: String): ViewModel() {

    private val currencyLiveData = MutableLiveData<List<Currency>>()

    fun observeCurrencies(): LiveData<List<Currency>> {
        return currencyLiveData
    }

    fun retrieveCurrencies() {
        val data = dataRepositoryFactory.retrieveLocalSource().getCurrencies(json)
        currencyLiveData.postValue(data)
    }
}


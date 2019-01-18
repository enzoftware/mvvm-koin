package com.projects.enzoftware.cryptotracker.data

import com.google.gson.Gson
import com.projects.enzoftware.cryptotracker.model.Currency

open class RemoteDataRepository() : DataRepository{
    override fun getCurrencies (json: String) : List<Currency> {
        // TODO: implement
        return emptyList()
    }
}
package com.projects.enzoftware.cryptotracker.data

import com.google.gson.Gson
import com.projects.enzoftware.cryptotracker.model.Currency

open class LocalDataRepository(private val gson: Gson) : DataRepository{
    override fun getCurrencies (json: String) : List<Currency> {
        return gson.fromJson(json, Array<Currency>::class.java).toList()
    }
}
package com.projects.enzoftware.cryptotracker.data

import com.projects.enzoftware.cryptotracker.model.Currency

interface DataRepository {
    fun getCurrencies(json: String) : List<Currency>
}
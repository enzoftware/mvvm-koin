package com.projects.enzoftware.cryptotracker

import com.projects.enzoftware.cryptotracker.model.Currency
import javax.xml.datatype.DatatypeFactory

object CurrencyFactory {

    fun makeCurrency(): Currency {
        return Currency(DataFactory.randomInt(), DataFactory.randomUuid(),
                        DataFactory.randomUuid(), DataFactory.randomUuid())
    }

    fun makeCurrencyList(count: Int): List<Currency> {
        return (0..count).map { makeCurrency() }
    }
}
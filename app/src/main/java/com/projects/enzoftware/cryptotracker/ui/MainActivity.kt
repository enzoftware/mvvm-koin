package com.projects.enzoftware.cryptotracker.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.projects.enzoftware.cryptotracker.R
import com.projects.enzoftware.cryptotracker.data.DataRepository
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    private val currenciesAdapter: CurrenciesAdapter by inject()
    private val dataRepositoryFactory: DataRepository by inject("local")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCurrenciesRecycler()

        val currenciesJson = resources.openRawResource(R.raw.currencies)
                .bufferedReader().use { it.readText() }
        val items = dataRepositoryFactory.getCurrencies(currenciesJson)
        currenciesAdapter.currencies = items

    }


    private fun setupCurrenciesRecycler() {
        recyclerViewCoins.layoutManager = LinearLayoutManager(this)
        recyclerViewCoins.adapter = currenciesAdapter
    }
}




package com.projects.enzoftware.cryptotracker.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.projects.enzoftware.cryptotracker.R
import com.projects.enzoftware.cryptotracker.viewmodel.CurrencyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    private val currenciesAdapter: CurrenciesAdapter by inject()
    //private val dataRepositoryFactory: DataRepository by inject("local")
    private val currenciesViewModel: CurrencyViewModel by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCurrenciesRecycler()

        currenciesViewModel.observeCurrencies().observe(this, Observer {
            it?.let { currenciesAdapter.currencies = it }
        })

        val currenciesJson = resources.openRawResource(R.raw.currencies)
                .bufferedReader().use { it.readText() }

        currenciesViewModel.retrieveCurrencies(currenciesJson)
    }


    private fun setupCurrenciesRecycler() {
        recyclerViewCoins.layoutManager = LinearLayoutManager(this)
        recyclerViewCoins.adapter = currenciesAdapter
    }
}




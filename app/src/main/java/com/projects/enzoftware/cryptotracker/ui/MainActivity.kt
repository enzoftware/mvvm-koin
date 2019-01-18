package com.projects.enzoftware.cryptotracker.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.projects.enzoftware.cryptotracker.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    private val currenciesAdapter: CurrenciesAdapter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCurrenciesRecycler()



    }


    private fun setupCurrenciesRecycler() {
        recyclerViewCoins.layoutManager = LinearLayoutManager(this)
        recyclerViewCoins.adapter = currenciesAdapter
    }
}




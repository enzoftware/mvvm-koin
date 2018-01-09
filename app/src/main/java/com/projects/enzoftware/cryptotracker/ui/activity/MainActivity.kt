package com.projects.enzoftware.cryptotracker.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.projects.enzoftware.cryptotracker.R
import com.projects.enzoftware.cryptotracker.model.CryptoCoin
import com.projects.enzoftware.cryptotracker.ui.adapter.CryptoCoinAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidNetworking.initialize(applicationContext)
        AndroidNetworking .get("https://api.coinmarketcap.com/v1/ticker/")
                .setPriority(Priority.LOW)
                .addQueryParameter("limit","50")
                .build()
                .getAsObjectList(CryptoCoin::class.java , object : ParsedRequestListener<List<CryptoCoin>>{
                    override fun onResponse(response: List<CryptoCoin>?) {
                        if (response != null) {
                            for (item in response) {
                                Log.i("success", item.id)
                                Log.i("success", item.name)
                                Log.i("success", item.symbol)
                                Log.i("success", item.price_usd)
                                Log.i("success", item.price_btc)
                                Log.i("success", item.rank)
                                Log.i("success", item.percent_change_24h.toString())
                                item.url = "https://raw.githubusercontent.com/cjdowner/cryptocurrency-icons/master/32/color/" + item.symbol.toLowerCase() + ".png"
                                Log.i("success", item.url)
                            }
                            printCryptoCoins(response)
                        }
                    }

                    override fun onError(anError: ANError?) {
                        Log.e("something fails :(",anError.toString())
                    }

                })
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun printCryptoCoins(list : List<CryptoCoin>?){
        val recycler = findViewById<RecyclerView>(R.id.recyclerViewCoins)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.hasFixedSize()
        recycler.adapter = CryptoCoinAdapter(this,list)
    }
}




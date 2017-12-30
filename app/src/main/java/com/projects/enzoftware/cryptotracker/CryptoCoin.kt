package com.projects.enzoftware.cryptotracker

/**
 * Created by enzoftware on 12/30/17.
 */
data class CryptoCoin ( val id : String,
                        val name : String,
                        val symbol : String,
                        val price_usd : String,
                        val price_btc : String,
                        val rank : String)
package com.projects.enzoftware.cryptotracker.model

/**
 * Created by enzoftware on 12/30/17.
 */

data class CryptoCoin ( var id : String,
                        var name : String,
                        var symbol : String,
                        var price_usd : String,
                        var price_btc : String,
                        var rank : String,
                        var url : String = "url",
                        var percent_change_24h : Double,
                        var percent_change_7d : Double)
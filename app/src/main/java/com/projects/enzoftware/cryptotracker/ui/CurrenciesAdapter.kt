package com.projects.enzoftware.cryptotracker.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.projects.enzoftware.cryptotracker.R
import com.projects.enzoftware.cryptotracker.model.Currency

class CurrenciesAdapter : RecyclerView.Adapter<CurrenciesAdapter.ViewHolder>() {

    private var currencies: List<Currency> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.cardiew_coin_detail, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = currencies.count()

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val currency = currencies[position]
        holder!!.nameText.text = currency.name
        holder.symbolText.text = currency.id.toString()
    }


    inner class  ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameText: TextView = view.findViewById(R.id.coinName)
        val symbolText: TextView = view.findViewById(R.id.coinId)
    }
}
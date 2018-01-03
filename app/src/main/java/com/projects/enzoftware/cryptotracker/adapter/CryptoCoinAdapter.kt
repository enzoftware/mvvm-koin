package com.projects.enzoftware.cryptotracker.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projects.enzoftware.cryptotracker.CryptoCoin
import com.projects.enzoftware.cryptotracker.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cardiew_coin_detail.view.*

/**
 * Created by enzoftware on 1/1/18.
 */

 class CryptoCoinAdapter (var context: Context, var lists : List<CryptoCoin>?): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.cardiew_coin_detail,parent,false)
        return Item(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as Item).bindData(lists!![position],context)
    }

    override fun getItemCount(): Int {
        return lists!!.size
    }

    class Item(itemView:View) : RecyclerView.ViewHolder(itemView){
        fun bindData(_list : CryptoCoin , context: Context){
            itemView.coinId.text = _list.symbol
            itemView.coinName.text = _list.name
            Picasso.with(context).load("https://raw.githubusercontent.com/cjdowner/cryptocurrency-icons/master/32/color/bnb.png").into(itemView.coinImage)
        }
    }

}
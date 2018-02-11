package com.projects.enzoftware.cryptotracker.ui.adapter

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projects.enzoftware.cryptotracker.R
import com.projects.enzoftware.cryptotracker.model.CryptoCoin
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cardiew_coin_detail.view.*
import org.jetbrains.anko.textColor


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
        fun bindData(_list : CryptoCoin, context: Context){
            itemView.coinId.text = _list.symbol
            itemView.coinName.text = _list.name
            itemView.textViewRank.text = _list.price_usd
            itemView.change24h.text =_list.percent_change_24h.toString()
            itemView.change7d.text = _list.percent_change_7d.toString()

            /**  IN JAVA WAY **/

            if (_list.percent_change_24h > 0){
                itemView.change24h.setTextColor(Color.parseColor("#00BF9A")) //00BF9A ==> MATERIAL GREEN
            }else{
                itemView.change24h.setTextColor(Color.parseColor("#F44336")) // F44336 ==> MATERIAL RED
            }

            /** IN KOTLIN WAY **/

            itemView.change7d.textColor =  if (_list.percent_change_7d > 0 ) Color.parseColor("#ABC123") else Color.parseColor("#123ABC")

            Picasso.with(context).load(_list.url).into(itemView.coinImage)
        }
    }

}
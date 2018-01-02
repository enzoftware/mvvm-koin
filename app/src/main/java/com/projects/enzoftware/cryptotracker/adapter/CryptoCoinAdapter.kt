package com.projects.enzoftware.cryptotracker.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.projects.enzoftware.cryptotracker.CryptoCoin

/**
 * Created by enzoftware on 1/1/18.
 */

private class CryptoCoinAdapter (var context: Context, var lists : ArrayList<CryptoCoin>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as Item).bindData(lists[position],context)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class Item(itemView:View) : RecyclerView.ViewHolder(itemView){
        fun bindData(_list : CryptoCoin , context: Context){

        }
    }

}
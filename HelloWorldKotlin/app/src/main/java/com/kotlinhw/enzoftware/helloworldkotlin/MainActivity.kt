package com.kotlinhw.enzoftware.helloworldkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findMyAgeBtn.setOnClickListener ({
            Toast.makeText(applicationContext,"Button is clicked", Toast.LENGTH_SHORT).show()
            val year:String = editAge.text.toString()
            val today:Int = Calendar.getInstance().get(Calendar.YEAR)
            val myAge:Int = today - year.toInt()
            showAgeTxv.text = "Your age is $myAge"

        })
    }
}

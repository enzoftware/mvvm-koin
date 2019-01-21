package com.projects.enzoftware.cryptotracker.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.projects.enzoftware.cryptotracker.R
import com.projects.enzoftware.cryptotracker.model.Currency
import com.projects.enzoftware.cryptotracker.utils.UrlHelper
import kotlinx.android.synthetic.main.currency_view.view.*
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class CurrencyView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttribute: Int = 0
) : LinearLayout(context, attrs, defStyleAttribute), KoinComponent {

    private val urlHelper: UrlHelper by inject()

    init {
        View.inflate(context, R.layout.currency_view, this)
    }

    fun setCurrency(currency: Currency) {
        text_name.text = currency.name
        text_symbol.text = currency.symbol

        setOnClickListener {
            urlHelper.launchCurrencyUrl(context, currency.slug)
        }
    }

}
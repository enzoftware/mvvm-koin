package com.projects.enzoftware.cryptotracker.utils

import android.content.Context
import android.net.Uri
import android.support.customtabs.CustomTabsIntent
import android.support.v4.content.ContextCompat
import com.projects.enzoftware.cryptotracker.R

class UrlHelper(private val url:String) {

    fun launchCurrencyUrl(context: Context, slug: String) {
        launchUrl(context, Uri.parse("$url$slug"))
    }

    private fun launchUrl(context: Context, uri: Uri) {
        val customTabsIntent = CustomTabsIntent.Builder()
                .addDefaultShareMenuItem()
                .setToolbarColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setShowTitle(true)
                .build()
        customTabsIntent.launchUrl(context, uri)
    }
}
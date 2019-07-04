package com.kimyasin.udemyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Lifestyle : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_lifestyle, container, false)


        val  mywebview= view.findViewById(R.id.webview) as WebView
        mywebview.loadUrl("https://www.udemy.com/courses/lifestyle/")

        val webSettings = mywebview.getSettings()
        webSettings.setJavaScriptEnabled(true)

        mywebview.setWebViewClient(WebViewClient())

        return view
    }
}

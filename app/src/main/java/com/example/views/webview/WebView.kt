package com.example.views.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.views.R

class WebView : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webView = findViewById<android.webkit.WebView>(R.id.web)
        supportActionBar?.title = "Google"

        webView.loadUrl("https://www.google.com")

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
    }
}
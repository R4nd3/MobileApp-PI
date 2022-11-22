package com.example.projetointegrador

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebViewClient
import com.example.projetointegrador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webView =  binding.webView
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://prismatic-starship-de841a.netlify.app/")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true


    }
}
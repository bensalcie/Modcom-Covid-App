package com.modcom.bensalcie.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        setContentView(R.layout.activity_details)
        val selected  = intent.getStringExtra("selected")

       when(selected){
           "1"->{
               val webdetails = findViewById<WebView>(R.id.webdetails)
               webdetails.loadUrl("file:///android_asset/about.html")
           }



       }


    }
}
package com.modcom.bensalcie.covidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    var selected:String = "0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardsymptoms = findViewById<CardView>(R.id.cardsymptoms)
        cardsymptoms.setOnClickListener {
            selected ="1"
            navigate(selected)

        }//end

    }

    private fun navigate(selected: String) {
         startActivity(Intent(this,DetailsActivity::class.java).putExtra("selected",selected.toString()))
    }


}
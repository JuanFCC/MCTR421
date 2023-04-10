package com.example.mctr421app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val optionsButton = findViewById<Button>(R.id.optionsButton)
        val progressBarWater = findViewById<ProgressBar>(R.id.progressBarWater)
        val txtView = findViewById<TextView>(R.id.textView)
        val progressBarMoisture = findViewById<ProgressBar>(R.id.progressBarMoisture)
        val txtView2 = findViewById<TextView>(R.id.textView2)
        val progressBarLight = findViewById<ProgressBar>(R.id.progressBarLight)
        val txtView3 = findViewById<TextView>(R.id.textView3)
        val progressBarBattery = findViewById<ProgressBar>(R.id.progressBarBattery)
        val txtView4 = findViewById<TextView>(R.id.textView4)

        progressBarWater.visibility = View.VISIBLE
        progressBarMoisture.visibility = View.VISIBLE
        progressBarLight.visibility = View.VISIBLE
        progressBarBattery.visibility = View.VISIBLE

        val iWater = 50
        val iMoisture = 60
        val iLight = 90
        val iBattery = 70

        progressBarWater.progress = iWater
        progressBarMoisture.progress = iMoisture
        progressBarLight.progress = iLight
        progressBarBattery.progress = iBattery














    }
}
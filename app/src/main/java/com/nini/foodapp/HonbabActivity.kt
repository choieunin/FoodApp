package com.nini.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HonbabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_honbab)

        val btn = findViewById<Button>(R.id.button1) as Button
        btn.setOnClickListener {
            startActivity(Intent(this@HonbabActivity, HonbabActivity::class.java))
        }
    }
}
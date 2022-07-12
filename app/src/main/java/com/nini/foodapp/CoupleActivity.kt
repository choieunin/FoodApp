package com.nini.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CoupleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_couple)


        val btn = findViewById<Button>(R.id.button1) as Button
        btn.setOnClickListener {
            startActivity(Intent(this@CoupleActivity, CoupleActivity::class.java))
        }
    }
}
package com.nini.foodapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)
        button1.setOnClickListener(ButtonListener())
    }

    inner class ButtonListener: View.OnClickListener {
        override fun onClick(v.View?){
        }
    }
}
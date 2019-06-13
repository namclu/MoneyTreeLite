package com.namlu.moneytreelite.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.namlu.moneytreelite.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add toolbar
        setSupportActionBar(toolbar)
    }
}

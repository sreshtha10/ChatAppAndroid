package com.sreshtha.chatappandroid.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sreshtha.chatappandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityBinding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

    }
}
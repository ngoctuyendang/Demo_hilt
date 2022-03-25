package com.example.test_hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_hilt.R
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment()
    }

    private fun loadFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, FirstFragment())
            .addToBackStack(FirstFragment::class.java.canonicalName)
            .commit()
    }
}
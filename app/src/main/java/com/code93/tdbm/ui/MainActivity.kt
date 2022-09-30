package com.code93.tdbm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import com.code93.tdbm.R
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExample = findViewById<Button>(R.id.btnExample)

        btnExample.setOnClickListener {
            viewModel.onCreate()
        }
    }
}
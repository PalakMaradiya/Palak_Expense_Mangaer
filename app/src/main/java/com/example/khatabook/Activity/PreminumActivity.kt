package com.example.khatabook.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khatabook.databinding.ActivityPreminumBinding

class PreminumActivity : AppCompatActivity() {
    lateinit var binding: ActivityPreminumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreminumBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {

        binding.imgClose.setOnClickListener {

            onBackPressed()
        }
    }
}
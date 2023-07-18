package com.example.khatabook.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.khatabook.databinding.ActivitySpleshScreenBinding

class SpleshScreenActivity : AppCompatActivity() {

    lateinit var  binding: ActivitySpleshScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpleshScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        Handler().postDelayed(
            {
            val i = Intent(this@SpleshScreenActivity, TermsActivity::class.java)
            startActivity(i)
            finish()
        }, 5000)

    }
}
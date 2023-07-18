package com.example.khatabook.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khatabook.databinding.ActivityTermsBinding

class TermsActivity : AppCompatActivity() {


    lateinit var  binding: ActivityTermsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTermsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {

        binding.btnContinue.setOnClickListener {

            val i = Intent(this@TermsActivity, HomeScreenActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}
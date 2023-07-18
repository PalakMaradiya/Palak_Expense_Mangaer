package com.example.khatabook.Activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.khatabook.Class.DatabaseHelper
import com.example.khatabook.databinding.ActivityPaymentModeBinding

class PaymentModeActivity : AppCompatActivity() {
    lateinit var binding: ActivityPaymentModeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentModeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        var database = DatabaseHelper(this, "Database.db", null)
        binding.btnApply.setOnClickListener {

        }
        binding.btnApply.setOnClickListener {
            val name = binding.edtPaymentMode.text.toString()

            if (name.isEmpty())
            {

                Toast.makeText(this, "Please Enter Your Payment Mode", Toast.LENGTH_SHORT).show()
            }
            else {
                database.InsertModeData(name)
                Toast.makeText(this, "Your Data Add SuccesFully", Toast.LENGTH_SHORT).show()
            }

        }




        binding.imgBack.setOnClickListener {

            onBackPressed()
        }
    }
}
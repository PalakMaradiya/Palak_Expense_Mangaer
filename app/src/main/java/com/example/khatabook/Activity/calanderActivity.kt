package com.example.khatabook.Activity

import android.os.Bundle
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.khatabook.databinding.ActivityCalanderBinding


class calanderActivity : AppCompatActivity() {

    lateinit var txtDate: TextView
    lateinit var Calenderview: CalendarView

    lateinit var  binding: ActivityCalanderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalanderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {

        binding.Calenderview.setOnDateChangeListener(
            OnDateChangeListener { view, year, month, dayOfMonth ->

                val Date = (dayOfMonth.toString() + "-"
                        + (month + 1) + "-" + year)
                binding.txtDate.setText(Date)
            })



    }
}
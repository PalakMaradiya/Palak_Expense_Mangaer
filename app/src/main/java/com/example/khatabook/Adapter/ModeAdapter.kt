package com.example.khatabook.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.khatabook.Activity.IncomeActivity
import com.example.khatabook.Modal.ModeModalclass
import com.example.khatabook.R
import java.util.ArrayList

class ModeAdapter(var incomeActivity: Context, var Modelist: ArrayList<ModeModalclass>)
    : BaseAdapter() {
    override fun getCount(): Int
    {
        return  Modelist.size
    }

    override fun getItem(p0: Int): Any? {
        return  null
    }

    override fun getItemId(p0: Int): Long {
       return  0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val v: View = LayoutInflater.from(incomeActivity).inflate(R.layout.mode_item_file, null)
        val Mode  = v.findViewById<TextView>(R.id.txtMode)
        Mode.text=Modelist[p0].name
        return v

    }
}
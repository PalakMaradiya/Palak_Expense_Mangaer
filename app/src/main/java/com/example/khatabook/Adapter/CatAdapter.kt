package com.example.khatabook.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.khatabook.Modal.ModalClass
import com.example.khatabook.R

class CatAdapter(var incomeActivity: Context, var Categorylist: java.util.ArrayList<ModalClass>) :
    BaseAdapter() {
    override fun getCount(): Int {
        return Categorylist.size
    }

    override fun getItem(p0: Int): Any? {

        return null


    }

    override fun getItemId(p0: Int): Long {
        return 0

    }

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val v: View = LayoutInflater.from(incomeActivity).inflate(R.layout.item_file_, null)
        val Category  = v.findViewById<TextView>(R.id.txtitemCategories)
        Category.text=Categorylist[p0].Category
        return v


    }


    fun refresh(list: ArrayList<ModalClass>) {

    }

    fun setDropDownViewResource(simpleSpinnerDropdownItem: Int) {
        TODO("Not yet implemented")
    }


}
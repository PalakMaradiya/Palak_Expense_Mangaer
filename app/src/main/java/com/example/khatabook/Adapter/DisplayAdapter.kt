package com.example.khatabook.Adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.khatabook.Modal.ModalClassDisplay
import com.example.khatabook.R

class DisplayAdapter(var context : Context,var  Displaylist: ArrayList<ModalClassDisplay>) :
    RecyclerView.Adapter<DisplayAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var cardViewColour : CardView = itemView.findViewById(R.id.cardViewColour)

        var txtDate : TextView = itemView.findViewById(R.id.txtDate)
        var txttype : TextView = itemView.findViewById(R.id.txttype)
        var txtAmount : TextView = itemView.findViewById(R.id.txtAmount)
        var txtNote : TextView = itemView.findViewById(R.id.txtNote)
        var txtCat : TextView = itemView.findViewById(R.id.txtCat)
        var txtMode : TextView = itemView.findViewById(R.id.txtMode)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisplayAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.display_item_file, parent, false)

        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {



        holder.txtDate.text = Displaylist [position]. date.toString()
        holder.txtAmount.text = Displaylist [position].amt.toString()
        holder.txtNote.text = Displaylist [position].note.toString()
        holder.txttype.text = Displaylist [position].type.toString()
        holder.txtCat.text = Displaylist [position].category.toString()
        holder.txtMode.text = Displaylist [position].mode.toString()


        if (holder.txttype.text.toString()=="0"){
            holder.txtAmount.setTextColor(Color.GREEN)
            holder.txttype.setTextColor(Color.GREEN)
            Log.e("TAG", "onBindViewHolder: "+holder.txtAmount.text.toString() )
        }
        else{
            holder.txttype.setTextColor(Color.RED)
            holder.txtAmount.setTextColor(Color.RED)
            Log.e("TAG", "onBindViewHolder: "+holder.txtAmount.text.toString() )
        }

    }

    override fun getItemCount(): Int {
       return  Displaylist.size
    }


    fun refresh(Displaylist: ArrayList<ModalClassDisplay>)
    {
        this.Displaylist = ArrayList()
        this.Displaylist.addAll(Displaylist)
        notifyDataSetChanged()
    }
}



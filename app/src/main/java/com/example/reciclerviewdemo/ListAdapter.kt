package com.example.reciclerviewdemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val contactats:ArrayList<Contacte>, val context: Context): RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = contactats[position]

        holder.tvItem.text = item.name
        holder.tvItem.setOnClickListener {
            val intent = Intent(context, ShowData::class.java)
            context.startActivity(intent)
            Toast.makeText(context, "Has clicat ${item.name} ${item.phone}"  , Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return contactats.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvItem = view.findViewById<TextView>(R.id.tv_item)


    }

}
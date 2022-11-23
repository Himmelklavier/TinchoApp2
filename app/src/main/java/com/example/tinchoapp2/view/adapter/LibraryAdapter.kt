package com.example.tinchoapp2.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tinchoapp2.R

class LibraryAdapter:RecyclerView.Adapter<LibraryAdapter.ViewHolder>(){
    override fun onCreateViewHolder(viewGroup:ViewGroup, i:Int): ViewHolder {
        val v=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_library, viewGroup, false)
        return ViewHolder(v)
    }

    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        var itemImage: ImageView = itemView.findViewById(R.id.image)
        var itemTitle: TextView = itemView.findViewById(R.id.title)
        var itemPrecio: TextView = itemView.findViewById(R.id.precio)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text=titles[i]
        viewHolder.itemPrecio.text=precio[i]
        viewHolder.itemImage.setImageResource(image[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    val titles= arrayOf("Empanada de Carne","Empanada de Pollo", "Empanada Capresse","Empanada de Carne Dulce","Empanada de Carne y Aceitunas")
    val precio= arrayOf("$6000","$6000","$6000","$7000","$7000")
    val image= arrayOf(R.drawable.menu1entradas2,R.drawable.menu1entradas2,R.drawable.menu1entradas2,R.drawable.menu1entradas2,R.drawable.menu1entradas2)
}
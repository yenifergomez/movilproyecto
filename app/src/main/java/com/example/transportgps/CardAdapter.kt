package com.example.transportgps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CardAdapter: RecyclerView.Adapter<CardAdapter.ViewHolder>(){

    val titles = arrayOf("Sotracauca",
        "comentarios1",
        "comentarios2",
        "comentarios3")

    val traspubenza = arrayOf("Traspuvenza",
        "comentarios1",
        "comentarios2",
        "comentarios3")

    val images = intArrayOf(R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background)

    override fun onCreateViewHolder(viewGroup: ViewGroup,i: Int): ViewHolder{
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card, viewGroup)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemTraspubenza.text = traspubenza[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle:TextView
        var itemTraspubenza: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemTraspubenza= itemView.findViewById(R.id.item_traspubenza)
        }
    }
}


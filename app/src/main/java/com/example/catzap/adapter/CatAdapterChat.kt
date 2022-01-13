package com.example.catzap.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.catzap.R
import com.example.catzap.datasource.Datasource.cats

class CatAdapterChat(private val context: Context?)
    :RecyclerView.Adapter<CatAdapterChat.CatChatViewHolder>(){

        class CatChatViewHolder(view: View): RecyclerView.ViewHolder(view) {
            val imageView: ImageView = view.findViewById(R.id.cat_image)
            val catName: TextView = view.findViewById(R.id.cat_name)
            val catChat: TextView = view.findViewById(R.id.cat_chat)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatChatViewHolder {
        // Inflate chat_item.xml
        val chatAdapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_item, parent, false)

        return  CatChatViewHolder(chatAdapterLayout)
    }

    override fun onBindViewHolder(holder: CatChatViewHolder, position: Int) {
        val item = cats[position]

        holder.imageView.setImageResource(item.imageResourceId)
        holder.catName.text = item.catName
        holder.catChat.text = item.catChat
    }

    override fun getItemCount(): Int { return cats.size }
}
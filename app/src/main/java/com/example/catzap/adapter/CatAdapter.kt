package com.example.catzap.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.catzap.R
import com.example.catzap.datasource.Datasource.cats

class CatAdapter(private val context:Context?
): RecyclerView.Adapter<CatAdapter.CatViewHolder>(){

    // Initiate elements
    class CatViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.story_image)
    }

    // Create and inflate the items
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        // Inflate stories item
        val storyLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.stories_item, parent, false)

        return CatViewHolder(storyLayout)
    }

    // Put the content in the items
    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val item = cats[position]

        holder.imageView.setImageResource(item.imageResourceId)

    }

    // Get the item count
    override fun getItemCount(): Int { return cats.size   }


}
package com.spacex.features.launches

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.spacex.data.model.Launch
import com.spacex.databinding.ItemLaunchBinding

class LaunchesAdapter(
    var items: MutableList<Launch> = mutableListOf(),
    private val onItemClick: ((Launch) -> Unit)? = null,
) : RecyclerView.Adapter<LaunchesAdapter.PostHolder>() {

    inner class PostHolder(private val view: ItemLaunchBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(item: Launch) {
            view.run {
                flightNumberTv.text="${item.flightNumber}"
                nameTv.text=item.name
                dateTv.text=item.dateLocal
                val imageLink=item.links?.flickr?.original?.firstOrNull()
                image.setImageURI(imageLink)
                progressBar.max=100
                progressBar.progress=50
                itemView.setOnClickListener { onItemClick?.invoke(item) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        return PostHolder(ItemLaunchBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
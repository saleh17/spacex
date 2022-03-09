package com.spacex.features.launches

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.spacex.R
import com.spacex.data.model.Launch
import com.spacex.databinding.ItemCategoryBinding
import com.spacex.databinding.ItemLaunchBinding

class CategoriesAdapter(
    var items: MutableList<String> = mutableListOf(),
) : RecyclerView.Adapter<CategoriesAdapter.CategoryHolder>() {

    var selectedPosition = 0

    inner class CategoryHolder(private val view: ItemCategoryBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun bind(item: String, position: Int) {
            view.run {
                setupUI(selectedPosition == position)
                nameTv.text = item
                itemView.setOnClickListener {
                    selectedPosition = position
                    notifyDataSetChanged()
                }
            }
        }

        private fun ItemCategoryBinding.setupUI(isSelected: Boolean) {
            val context = itemView.context
            nameTv.setBackgroundResource(if (isSelected) R.drawable.bgd_gold_rounded else 0)
            nameTv.setTextColor(
                ContextCompat.getColor(
                    context,
                    if (isSelected) R.color.white else R.color.black
                )
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        return CategoryHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val item = items[position]
        holder.bind(item,position)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
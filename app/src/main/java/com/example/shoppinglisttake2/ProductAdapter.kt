package com.example.shoppinglisttake2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_product.view.*

class ProductAdapter(private val shoppingList: List<Shoppinglist>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )
    }

    override fun getItemCount(): Int = shoppingList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(shoppingList[position])

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(shoppinglist: Shoppinglist) {
            itemView.tvProduct.text = shoppinglist.shoppingItem
            itemView.tvAmount.text = shoppinglist.amount.toString()
        }
    }
}
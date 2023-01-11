package com.example.recyclerviewwithviewtype

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter(
    private var products : ArrayList<Product>
) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    private lateinit var product : Product
    private lateinit var imgProduct : ImageView
    private lateinit var txtProductTitle : TextView
    private lateinit var txtProductPrice : TextView

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsAdapter.ProductViewHolder {
        var layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        var productView : View = layoutInflater.inflate(R.layout.product_view,null)
        var imgProduct = productView.findViewById<View>(R.id.imgProduct)

        return ProductViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ProductsAdapter.ProductViewHolder, position: Int) {
       var product : Product = products[position]   //products.get(position)
        imgProduct = holder.itemView.findViewById(R.id.imgProduct)
    }

    override fun getItemCount(): Int {
       return products.size
    }


}
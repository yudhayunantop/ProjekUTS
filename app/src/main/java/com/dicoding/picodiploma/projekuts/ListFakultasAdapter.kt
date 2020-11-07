package com.dicoding.picodiploma.projekuts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFakultasAdapter (val listfakultas: ArrayList<fakultas>) : RecyclerView.Adapter<ListFakultasAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_fakultas, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val fakultas = listfakultas[position]

        Glide.with(holder.itemView.context)
            .load(fakultas.photo)
            .apply(RequestOptions().override(70, 70))
            .into(holder.imgPhoto)

        holder.tvName.text = fakultas.name

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listfakultas[holder.adapterPosition]) }

        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                onItemClickCallback.onItemClicked(listfakultas[holder.adapterPosition])
                val detailhalaman =
                    Intent(view.context.applicationContext, DetailActivity::class.java)

                detailhalaman.putExtra(DetailActivity.NAMA, fakultas.name)
                detailhalaman.putExtra(DetailActivity.DETAIL, fakultas.detail)
                detailhalaman.putExtra(DetailActivity.PHOTO, fakultas.photo)
                detailhalaman.putExtra(DetailActivity.EMAIL, fakultas.email)
                detailhalaman.putExtra(DetailActivity.WEB, fakultas.web)
                view.context.startActivity(detailhalaman)
            }
        })
    }

    override fun getItemCount(): Int {
        return listfakultas.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: fakultas)
    }
}
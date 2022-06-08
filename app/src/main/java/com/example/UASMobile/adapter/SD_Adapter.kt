package com.example.UASMobile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.UASMobile.R
import com.example.UASMobile.model.SD

class SD_Adapter(
    private val context: Context,
    private val sdArrayList: ArrayList<SD>

):RecyclerView.Adapter<SD_Adapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val namaSekolahSDtextview: TextView = view.findViewById(R.id.nama_sekolah_sd_indonesia)
        val gambarSekolahSD: ImageView = view.findViewById(R.id.gambar_sekolah_sd_indonesia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val sekolahSDAdapterlayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sekolah_sd,parent,false)
        return ItemViewHolder(sekolahSDAdapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = sdArrayList[position]
        holder.namaSekolahSDtextview.text = context?.resources.getString(item.namasekolahSD)
        holder.gambarSekolahSD.setImageResource(item.gambarsekolahSD)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Data dipilih", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return sdArrayList.size
    }

}
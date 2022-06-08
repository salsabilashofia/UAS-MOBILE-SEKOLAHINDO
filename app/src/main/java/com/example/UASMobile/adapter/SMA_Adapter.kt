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
import com.example.UASMobile.model.SMA

class SMA_Adapter(
    private val context: Context,
    private val smaArrayList: ArrayList<SMA>

):RecyclerView.Adapter<SMA_Adapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val namaSekolahSMAtextView: TextView = view.findViewById(R.id.nama_sekolah_sma_indonesia)
        val gambarSekolahSMA: ImageView = view.findViewById(R.id.gambar_sekolah_sma_indonesia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val sekolahSMAAdapterlayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sekolah_sma,parent,false)
        return ItemViewHolder(sekolahSMAAdapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = smaArrayList[position]
        holder.namaSekolahSMAtextView.text = context.resources.getString(item.namasekolahSMA)
        holder.gambarSekolahSMA.setImageResource(item.gambarsekolahSMA)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Data dipilih", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return smaArrayList.size
    }

}
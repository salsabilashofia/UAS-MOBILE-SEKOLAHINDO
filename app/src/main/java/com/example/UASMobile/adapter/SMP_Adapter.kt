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
import com.example.UASMobile.model.SMP

class SMP_Adapter(
    private val context: Context,
    private val smpArrayList: ArrayList<SMP>

):RecyclerView.Adapter<SMP_Adapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val namaSekolahSMPtextView: TextView = view.findViewById(R.id.nama_sekolah_smp_indonesia)
        val gambarSekolahSMP: ImageView = view.findViewById(R.id.gambar_sekolah_smp_indonesia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val sekolahSMPAdapterlayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sekolah_smp,parent,false)
        return ItemViewHolder(sekolahSMPAdapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = smpArrayList[position]
        holder.namaSekolahSMPtextView.text = context?.resources.getString(item.namasekolahSMP)
        holder.gambarSekolahSMP.setImageResource(item.gambarsekolahSMP)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Data dipilih", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return smpArrayList.size
    }

}
package com.example.UASMobile.ui.SekolahMenengahAkhir

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.UASMobile.Model.SMA
import com.example.UASMobile.R

class SMAViewModel : ViewModel() {
    var SMAMutableLiveData: MutableLiveData<ArrayList<SMA>?> = MutableLiveData()
    var SMAArrayList: ArrayList<SMA>? = null

    fun init(){
        SMAlist()
        SMAMutableLiveData.value = SMAArrayList
    }

    fun SMAlist(){
        var s_menengah_akhir = SMA(R.string.sma1, R.drawable.sma1)
        SMAArrayList = ArrayList()
        SMAArrayList!!.add(s_menengah_akhir)
        s_menengah_akhir = SMA(R.string.sma2, R.drawable.sma2)
        SMAArrayList!!.add(s_menengah_akhir)
        s_menengah_akhir = SMA(R.string.sma3, R.drawable.sma3)
        SMAArrayList!!.add(s_menengah_akhir)
    }
    init {
        init()
    }

}
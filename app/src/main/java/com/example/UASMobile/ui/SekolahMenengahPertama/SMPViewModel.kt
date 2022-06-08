package com.example.UASMobile.ui.SekolahMenengahPertama

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.UASMobile.R
import com.example.UASMobile.model.SMP

class SMPViewModel : ViewModel() {
    var SMPMutableLiveData: MutableLiveData<ArrayList<SMP>?> = MutableLiveData()
    var SMPArrayList: ArrayList<SMP>? = null

    fun init(){
        SMPlist()
        SMPMutableLiveData.value = SMPArrayList
    }

    fun SMPlist(){
        var s_menengah_pertama = SMP(R.string.smp1,R.drawable.smp1)
        SMPArrayList = ArrayList()
        SMPArrayList!!.add(s_menengah_pertama)
        s_menengah_pertama = SMP(R.string.smp2,R.drawable.smp2)
        SMPArrayList!!.add(s_menengah_pertama)
    }
    init {
        init()
    }

}

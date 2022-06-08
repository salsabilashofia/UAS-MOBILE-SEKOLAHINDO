package com.example.UASMobile.ui.SekolahMenengahPertama

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.UASMobile.R
import com.example.UASMobile.adapter.SMP_Adapter
import com.example.UASMobile.databinding.FragmentSekolahSmpBinding
import com.example.UASMobile.model.SMP

class SMPFragment : Fragment(R.layout.fragment_sekolah_smp) {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentSekolahSmpBinding? = null
    private val binding get() = _binding!!
    var recyclerViewSMPAdapter: SMP_Adapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val SMPViewModel =
            ViewModelProvider(this).get(SMPViewModel::class.java)
        SMPViewModel?.SMPMutableLiveData!!.observe(viewLifecycleOwner,SMPListUpdateObserver)
        _binding = FragmentSekolahSmpBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewSmp
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var SMPListUpdateObserver : Observer<ArrayList<SMP>?> =
        Observer<ArrayList<SMP>?>{ SMPArrayList ->
            recyclerViewSMPAdapter = SMP_Adapter(requireContext(),SMPArrayList)
            recyclerView!!.layoutManager = LinearLayoutManager(context)
            recyclerView!!.adapter = recyclerViewSMPAdapter
        }
}
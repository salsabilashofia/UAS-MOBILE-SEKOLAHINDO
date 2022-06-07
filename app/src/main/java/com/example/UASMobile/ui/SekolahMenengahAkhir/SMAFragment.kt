package com.example.UASMobile.ui.SekolahMenengahAkhir

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.UASMobile.Model.SMA
import com.example.UASMobile.R
import com.example.UASMobile.databinding.FragmentSekolahSmaBinding

class SMAFragment : Fragment(R.layout.fragment_sekolah_sma) {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentSekolahSmaBinding? = null
    private val binding get() = _binding!!
    var recyclerViewSMAAdapter: SMA_Adapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val SMAViewModel =
            ViewModelProvider(this).get(SMAViewModel::class.java)
        SMAViewModel?.SMAMutableLiveData!!.observe(viewLifecycleOwner,SMAListUpdateObserver)
        _binding = FragmentSekolahSmaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewSma
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var SMAListUpdateObserver : Observer<ArrayList<SMA>?> =
        Observer<ArrayList<SMA>?>{ SMAArrayList ->
            recyclerViewSMAAdapter = SMA_Adapter(requireContext(),SMAArrayList)
            recyclerView!!.layoutManager = LinearLayoutManager(context)
            recyclerView!!.adapter = recyclerViewSMAAdapter
        }
}
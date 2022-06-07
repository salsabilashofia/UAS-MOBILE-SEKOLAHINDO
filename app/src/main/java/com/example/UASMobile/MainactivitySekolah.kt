package com.example.UASMobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.UASMobile.databinding.ActivityMainsekolahBinding
import java.util.*

class MainactivitySekolah : AppCompatActivity() {
    private lateinit var binding: ActivityMainsekolahBinding
    private lateinit var locale:Locale
    private var currenlang:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainsekolahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bahasaindo:Button = binding.indo
        val bahasainggris:Button = binding.english

        bahasaindo.setOnClickListener{
            pilihanbahasa("id")
        }
        bahasainggris.setOnClickListener{
            pilihanbahasa("en")
        }

    }
    private fun pilihanbahasa(bahasa :String){
        locale = Locale(bahasa)
        val res = resources
        val dm = res.displayMetrics
        val config = res.configuration
        config.locale = locale
        res.updateConfiguration(config,dm)
        val baru = Intent(this,MainActivity::class.java)
        baru.putExtra(currenlang,bahasa)
        startActivity(baru)
    }
}
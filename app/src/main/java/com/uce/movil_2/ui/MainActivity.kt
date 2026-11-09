package com.uce.movil_2.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.uce.movil_2.R
import com.uce.movil_2.databinding.ActivityMainBinding
import java.net.URI
import androidx.core.net.toUri
import com.uce.movil_2.fragments.ColorFragment
import com.uce.movil_2.fragments.FirstFragment
import com.uce.movil_2.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }
    fun initListener(){
//        binding.btnWp.setOnClickListener {
////            val uri = ("https://api.whatsapp.com/send?phtone=593961334199" + "&text=hola").toUri()
////            val wpIntent = Intent(Intent.ACTION_VIEW,uri)
////            wpIntent.action = Intent.ACTION_VIEW
////            wpIntent.setPackage("com.whatsapp")
////            startActivity(wpIntent)
//
//            val trasaccion = supportFragmentManager.beginTransaction()
//            trasaccion.replace(R.id.frglayaout, FirstFragment())
//            trasaccion.commit()
//        }
        binding.btnmaps.setOnClickListener {
            val transaccion = supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.frglayaout, ProfileFragment()) // <-- O el ColorFragment / ProfileFragment
            transaccion.commit()
        }
//        val coord = ("geo: -0.19929637180422433, -78.50730625723023 " +
//                "?z=13" +
//                "?q=" + Uri.encode("Universidad Central de Ecuador")).toUri()
//        binding.btnmaps.setOnClickListener {
//            val mapIntent = Intent(Intent.ACTION_VIEW,coord)
//            mapIntent.setPackage("com.google.android.apps.maps")
//
//            mapIntent.resolveActivity(packageManager)?.let {
//                startActivity(mapIntent)
//            }

        }
    }

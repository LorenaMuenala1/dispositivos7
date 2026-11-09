package com.uce.movil_2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uce.movil_2.databinding.ActivityLoginBinding

// L calse es la que indexa el iud
class Login : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    var counter =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }
    fun initListener(){
        binding.boton1.setOnClickListener {
            val username =binding.textImput2.text.toString()
            val password = binding.textView1
            binding.texto1.text = counter.toString()
        }

    }
    private fun contador(): Int{
        counter++
        return counter
    }
}
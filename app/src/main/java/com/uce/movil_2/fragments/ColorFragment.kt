package com.uce.movil_2.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uce.movil_2.databinding.FragmentColorBinding
import kotlin.random.Random

class ColorFragment : Fragment() {
    private lateinit var binding: FragmentColorBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentColorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnChangeColor.setOnClickListener {
            val colorAleatorio = Color.argb(
                255,
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            binding.layoutContainer.setBackgroundColor(colorAleatorio)
        }
    }
}
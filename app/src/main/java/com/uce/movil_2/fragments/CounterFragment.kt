package com.uce.movil_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uce.movil_2.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {
    private lateinit var binding: FragmentCounterBinding
    private var contador = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentCounterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.btnIncrement.setOnClickListener {
            contador++
            binding.tvCounter.text = contador.toString()
        }
    }
}
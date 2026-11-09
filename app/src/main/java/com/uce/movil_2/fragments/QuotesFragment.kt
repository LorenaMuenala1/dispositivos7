package com.uce.movil_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uce.movil_2.databinding.FragmentQuotesBinding

class QuotesFragment : Fragment() {
    private lateinit var binding: FragmentQuotesBinding

    // Aquí guardamos nuestra lista de frases
    private val frases = listOf(
        "Los pequeños progresos de hoy, son los grandes logros de mañana.",
        "Tus apuntes reflejan el orden de tu mente. ¡Sigue así!",
        "El éxito es la suma de pequeños esfuerzos repetidos día tras día.",
        "La creatividad no se gasta. Cuanta más usas, más tienes.",
        "No te detengas hasta que te sientas orgullosa del resultado."
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Asegúrate de que el nombre del Binding coincida con el nombre de tu archivo XML
        binding = FragmentQuotesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNextQuote.setOnClickListener {
            // Selecciona una frase aleatoria de la lista y la muestra en el TextView
            val fraseAleatoria = frases.random()
            binding.tvQuote.text = "\"$fraseAleatoria\""
        }
    }
}
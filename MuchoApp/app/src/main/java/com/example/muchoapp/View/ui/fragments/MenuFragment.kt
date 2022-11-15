package com.example.muchoapp.View.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.muchoapp.R


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardPizza= view.findViewById<CardView>(R.id.fragPizza)
        cardPizza.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_pizzasFragment)
        }

        val cardSopas = view.findViewById<CardView>(R.id.fragSopa)
        cardSopas.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_sopasFragment)
        }

        val cardBebidas = view.findViewById<CardView>(R.id.fragBebidas)
        cardBebidas.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_bebidasFragment)
        }

        val cardEnsaladas = view.findViewById<CardView>(R.id.fragEnsaladas)
        cardEnsaladas.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_ensaladasFragment)
        }

        val cardPlatos = view.findViewById<CardView>(R.id.fragPlatos)
        cardPlatos.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_platosFragment)
        }

        val cardPostres = view.findViewById<CardView>(R.id.fragPostres)
        cardPostres.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_postresFragment)
        }
    }
}
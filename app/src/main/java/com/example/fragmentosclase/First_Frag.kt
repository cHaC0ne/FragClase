package com.example.fragmentosclase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fragmentosclase.databinding.FragmentFirstBinding



class First_Frag : Fragment() {
    private lateinit var b:FragmentFirstBinding



    private val dados = arrayOf<Int>(
        R.drawable.dice1,
        R.drawable.img,
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3,
        R.drawable.img_4
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        b = FragmentFirstBinding.inflate(layoutInflater)

        b.ivDado1.setOnClickListener{
            val dado1 = (1..6).random()
            val dado2 = (1..6).random()
            b.ivDado1.setImageResource(dados[dado1 -1])
            b.ivDado2.setImageResource(dados[dado2 -1])
            b.tvTotal.text = (dado1.plus(dado2)).toString()


        }
        b!!.ivDado2.setOnClickListener{
            val dado1 = (1..6).random()
            val dado2 = (1..6).random()
            b.ivDado1.setImageResource(dados[dado1 -1])
            b.ivDado2.setImageResource(dados[dado2 -1])
            b.tvTotal.text = (dado1.plus(dado2)).toString()
        }

       // FragmentFirstBinding.inflate(inflater, container, false)
        return b.root
    }


}







package com.example.fragmentosclase

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentosclase.databinding.FragmentFirstBinding
import com.example.fragmentosclase.databinding.FragmentSecondBinding


class Second_Frag : Fragment() {
    private var b: FragmentSecondBinding? = null
    private val binding get() = b!!
    private var lista = mutableMapOf<String, String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentSecondBinding.inflate(layoutInflater)

        b!!.btnAdd.setOnClickListener {
            Toast.makeText(this.context, "¿QUE TE CREIAS :)?", Toast.LENGTH_LONG).show()
            if (b!!.etArticulo.text.isNotEmpty() and b!!.etArticulo.text.isNotEmpty()){
                lista.put(b!!.etArticulo.text.toString(), b!!.etPrecio.text.toString())
                b!!.etArticulo.text.clear()
                b!!.etPrecio.text.clear()
                // msj(lista.toString())
            } else {
                msj("Todos los campos son obligatorios")
            }
        }
//        b.btnEnviar.setOnClickListener {
//            val myIntent = Intent (this@Second_Frag, ResultActivity::class.java)
//            lista.forEach { k,v ->
//                myIntent.putExtra(k,v)
//            }
//            startActivity(myIntent)
//        }

        // Inflate the layout for this fragment
        FragmentSecondBinding.inflate(inflater, container, false)
        return b!!.root
    }


    fun msj (str:String){
        Toast.makeText(this.context, str, Toast.LENGTH_LONG).show()
    }

}






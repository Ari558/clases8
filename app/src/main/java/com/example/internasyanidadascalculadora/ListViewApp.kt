package com.example.internasyanidadascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ListViewApp : AppCompatActivity() {
    private var lvlenguaje:ListView?=null
    private var tvSeleccion:TextView?=null

    private val lenguaje =arrayOf("kotlin","java","C++", "C#","PHP","VB.net")
    private val posicion = arrayOf("1","2","3","4","5","9")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_app)
        lvlenguaje=findViewById(R.id.lv_Lenguajes)
        tvSeleccion=findViewById(R.id.tv_Seleccion)

        var adaptador: ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.list_item_claseprogramacion, lenguaje)
        lvlenguaje?.adapter=adaptador

        lvlenguaje?.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                tvSeleccion?.text="La posicion del Lenguale ${lvlenguaje?.getItemAtPosition(position)} es ${posicion[position]}"
            }


        }


        }




    }


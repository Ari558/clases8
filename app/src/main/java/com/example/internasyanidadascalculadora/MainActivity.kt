package com.example.internasyanidadascalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etn_valor1: EditText? = null
    lateinit var etn_valor2: EditText
    lateinit var tv_Resultado: TextView
    lateinit var rb_Suma: RadioButton
    lateinit var rb_Resta:RadioButton
    lateinit var rb_Multiplicacion:RadioButton
    lateinit var rb_Divicion:RadioButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etn_valor1 = findViewById(R.id.etn_valor1)
        etn_valor2 = findViewById(R.id.etn_valor2)
        tv_Resultado = findViewById(R.id.tvz_result)

        rb_Suma = findViewById(R.id.rb_Suma)
        rb_Resta = findViewById(R.id.rb_Resta)
        rb_Multiplicacion = findViewById(R.id.rb_Multiplicacion)
        rb_Divicion = findViewById(R.id.rb_Divicion)
    }

    fun calcular(resultad: View) {

        val valor1_String = etn_valor1?.text.toString()
        val valor2_String = etn_valor2.text.toString()

        val valor1_Int = valor1_String.toInt()
        val valor2_Int = Integer.parseInt(valor2_String)

        if(rb_Suma.isChecked== true) {
            val suma = valor1_Int + valor2_Int
            val resultado = suma.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Resta.isChecked== true){
            val resta = valor1_Int - valor2_Int
            val resultado = resta.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Multiplicacion.isChecked== true){
            val multi = valor1_Int * valor2_Int
            val resultado = multi.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Divicion.isChecked== true){
            if (valor2_Int!= 0 && valor1_Int!=0){
                    val divi = valor1_Int / valor2_Int
                    val resultado = divi.toString()
                    tv_Resultado.setText(resultado)
            } else {
                Toast.makeText(this, "no se puede dividir 0", Toast.LENGTH_SHORT).show()

            }

        }
    }


    private fun claseAnidadasyInternas() {
        // Clase anidada (masterd class)
        val miClaseAnidada = miClaseAnidadasyInternas.miClaseAnidada()
        val sumarDosNumeros = miClaseAnidada.suma(5, 6)
        println("el resulatdo de la suma es $sumarDosNumeros ")

        //clase interna
        val miClaseInterna = miClaseAnidadasyInternas().miClaseInterna()
        println("El resulatado de la suma es ${miClaseInterna.sumaDos(3)}")
    }
    fun btnSiguiente(Vista:View){
        val ventanaSiguiente: Intent = Intent(applicationContext,ListViewApp::class.java)
        startActivity(ventanaSiguiente)

    }

}
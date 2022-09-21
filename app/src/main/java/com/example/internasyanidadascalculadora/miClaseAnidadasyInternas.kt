package com.example.internasyanidadascalculadora

class miClaseAnidadasyInternas {
    //calse anidada que puede estar dentro de ora clase


    private val uno = 1
    private fun retornarUno():Int{
        return uno
    }
    class miClaseAnidada{
        fun suma(n1:Int,n2:Int):Int{
            return n1 + n2

        }
    }

    inner class miClaseInterna(){
        fun sumaDos(num:Int):Int{
            return num + uno + retornarUno()
        }
    }
}
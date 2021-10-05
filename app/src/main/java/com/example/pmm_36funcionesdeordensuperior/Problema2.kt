package com.example.pmm_36funcionesdeordensuperior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val persona = Persona("John",20)
        persona.esMayorDeEdad { esMayorDeEdadUsa(persona.edad) }

        val tvResultado = findViewById<TextView>(R.id.tvResultado20)
        val resultadoUsa = "USA: "+persona.toString().plus(" es mayor de edad: "+persona.esMayorDeEdad { esMayorDeEdadUsa(persona.edad) })
        val resultadoArg = "Argentina: "+persona.toString().plus(" es mayor de edad: "+persona.esMayorDeEdad { esMayorDeEdadArgentina(persona.edad) })
        tvResultado.text = resultadoUsa.plus("\n"+resultadoArg)



    }
    fun esMayorDeEdadUsa(edad:Int):Boolean{
        return edad >= 21
    }
    fun esMayorDeEdadArgentina(edad:Int):Boolean{
        return edad >= 18
    }

}
class Persona(var nombre:String,var edad:Int){
    fun esMayorDeEdad(funcion:(edad:Int)->Boolean): Boolean{
        return funcion(edad)
    }

    override fun toString(): String {
        return "$nombre, edad $edad años"
    }

}





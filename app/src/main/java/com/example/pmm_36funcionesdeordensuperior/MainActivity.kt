package com.example.pmm_36funcionesdeordensuperior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tvResultado = findViewById<TextView>(R.id.tvResultado10)
        val resultado = "Suma de: operar(2,5,::sumar) -> ${operar(2,5,::sumar)}"
        tvResultado.text = resultado

    }

    fun operar(int0:Int, int1:Int, operacion:(Int, Int)-> Int): Int{
        return operacion(int0,int1)
    }

    fun sumar(int0:Int,int1:Int):Int{
        return int0+int1
    }
}
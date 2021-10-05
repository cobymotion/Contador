package com.mjdesarrollos.apps.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // esto debe de estar despues de aparecer el contenido
        val numContador: TextView = findViewById(R.id.numContador)
        numContador.text = "0"
        val boton: Button = findViewById(R.id.btnAumentar)
        boton.setOnClickListener {
            // lo que el boton va a hacer
            Log.e("MIAPP","Se presiono el botón")
            numContador.text="Algo"
        }

    }
}
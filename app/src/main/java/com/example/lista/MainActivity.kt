package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonas:ListView=findViewById(R.id.listaPersonas)
        var personas = mutableListOf<Persona>()

        var per1 = Persona("Duvan Mauricio Cataño Penna", "+57 314 8865545", R.drawable.mauricio)
        var per2 = Persona("Leticia Michell Campos Balanzar", "+52 744 335 9626", R.drawable.michell)
        var per3 = Persona("Luz Enith Penna Plazas", "+57 320 2012637", R.drawable.madre)

        personas.add(per1)
        personas.add(per2)
        personas.add(per3)

        val adaptador: Adaptador = Adaptador(this,R.layout.elementopersona, personas)

        listaPersonas.adapter = adaptador

        listaPersonas.setOnItemClickListener { adapterView, view, posicion, id ->
            Toast.makeText(this@MainActivity, "Click en posicion $posicion, con nombre: " + personas[posicion].nombre, Toast.LENGTH_SHORT).show()
        }
    }
}
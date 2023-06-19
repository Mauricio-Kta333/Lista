package com.example.lista


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adaptador:BaseAdapter {

    lateinit var contexto: Context
    var layout:Int=0
    lateinit var listaPersonas:List<Persona>


    constructor(contexto: Context, layout: Int, listaPersonas:List<Persona>){
        this.contexto = contexto
        this.layout = layout
        this.listaPersonas = listaPersonas

    }

    override fun getCount(): Int {
        return listaPersonas.size
    }

    override fun getItem(posicion: Int): Any {
        return listaPersonas[posicion]
    }

    override fun getItemId(posicion: Int): Long {
        return posicion.toLong()
    }

    override fun getView(posicion: Int, vista: View?, parent: ViewGroup?): View {
        var  v:View
        var inflater:LayoutInflater= LayoutInflater.from(contexto)
        v = inflater.inflate(R.layout.elementopersona, null)
        val txtNombre:TextView=v.findViewById(R.id.txtNombre)
        txtNombre.text = listaPersonas[posicion].nombre
        val txtTelefono:TextView=v.findViewById(R.id.txtTelefono)
        txtTelefono.text = listaPersonas[posicion].celular
        val imgFoto:ImageView=v.findViewById(R.id.imgfoto)
        imgFoto.setImageResource(listaPersonas[posicion].foto)
        return v;
    }
}
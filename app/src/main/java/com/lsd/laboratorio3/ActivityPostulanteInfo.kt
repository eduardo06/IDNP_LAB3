package com.lsd.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityPostulanteInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postulante_info)

        //recogemos la lista enviada de activity_menu
        val bundle: Bundle? = intent.extras
        val listaPostulante: MutableList<Postulante>  = intent.getSerializableExtra("listaPostulantes") as MutableList<Postulante>

        //ingresamos el nombre a buscar
        val nombre = findViewById<EditText>(R.id.etBuscar)
        val buscar = findViewById<Button>(R.id.btnBuscar)

        val getNombre = findViewById<TextView>(R.id.txtNombre)
        val getApellidos = findViewById<TextView>(R.id.txtApellidos)
        val getNacimiento = findViewById<TextView>(R.id.txtNacimiento)
        val getColegio = findViewById<TextView>(R.id.txtColegio)
        val getCarrera = findViewById<TextView>(R.id.txtCarrera)


        buscar.setOnClickListener{

            //mostramos los datos del postulante en pantalla
            for (i in listaPostulante) {
                if (nombre.text.toString() == i.nombre) {
                    getNombre.text = i.nombre
                    getApellidos.text = i.apellidoP
                    getNacimiento.text = i.fechaN
                    getColegio.text = i.colegio
                    getCarrera.text = i.carrera
                }
            }
        }
    }
}
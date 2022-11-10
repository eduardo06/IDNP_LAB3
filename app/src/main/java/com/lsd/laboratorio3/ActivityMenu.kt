package com.lsd.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //arreglo de postulantes
        val listaPostulantes:MutableList<Postulante> = mutableListOf()
        val infoPost = findViewById<Button>(R.id.btnInfoPost)

        //Recogemos los datos de mainactivity
        val bundle: Bundle? = intent.extras

        //queca que haya datos recividos
        if (bundle != null && !bundle.isEmpty()){

            val postulante = bundle.get("objetoPostulante") as Postulante
            Toast.makeText(this, postulante.nombre.toString(), Toast.LENGTH_SHORT).show()

            listaPostulantes.add(postulante)

            infoPost.setOnClickListener{
                val intent = Intent(this,ActivityPostulanteInfo::class.java)
                intent.putExtra("listaPostulantes",listaPostulantes as java.io.Serializable)
                startActivity(intent)
            }
        }

        val new = findViewById<Button>(R.id.btnNuevo)

        new.setOnClickListener{
            val intent = Intent(this,ActivityPostulanteRegistro::class.java)
            startActivity(intent)
        }
    }
}
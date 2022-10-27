package com.lsd.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityPostulanteRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postulante_registro)

        //recivo los campos
        val nombre = findViewById<EditText>(R.id.etName)
        val apellidoP = findViewById<EditText>(R.id.etLastNameP)
        val apellidoM = findViewById<EditText>(R.id.etLastNameM)
        val fechaN = findViewById<EditText>(R.id.etDate)
        val colegio = findViewById<EditText>(R.id.etColegio)
        val carrera = findViewById<EditText>(R.id.etCarrera)
        val registrar = findViewById<Button>(R.id.btnRegistrar)

        registrar.setOnClickListener{
            //guardamos los datos en el objeto postulante
            var postulante = Postulante(nombre.text.toString(),apellidoP.text.toString(),apellidoM.text.toString(),fechaN.text.toString()
                ,colegio.text.toString(),carrera.text.toString())

            //val mensaje = postulante.fechaN
            //Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

            registerForActivityResult(postulante)
        }
    }
    //envia los datos al activityMenu
    fun registerForActivityResult(postulante: Postulante){
        val intent = Intent(this,ActivityMenu::class.java)
        intent.putExtra("objetoPostulante",postulante as java.io.Serializable)
        startActivity(intent)
    }
}
package com.lsd.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Accedemos a los datos igresados en el Login
        val user = findViewById<EditText>(R.id.etUser)
        val password = findViewById<EditText>(R.id.etPassword)
        val login = findViewById<Button>(R.id.btnIngresar)

        //evento que sucede cuando se hace click en el boton de ingresar
        login.setOnClickListener{

            //imprimimos un mensaje en la pantalla que nos da la bienvenida
            Toast.makeText(this, "Bienvenido: ${user.text.toString()}", Toast.LENGTH_SHORT).show()

            //nos redirijimos al activity menu
            val intent = Intent(this,ActivityMenu::class.java)
            startActivity(intent)
        }
    }
}
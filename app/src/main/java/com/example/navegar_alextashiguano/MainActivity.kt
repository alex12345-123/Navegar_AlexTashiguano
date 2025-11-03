package com.example.navegar_alextashiguano

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import android.provider.ContactsContract.CommonDataKinds.Phone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txtNombre = findViewById<TextView>(R.id.txtNombre)
        val txtCurso = findViewById<TextView>(R.id.txtCurso)
        val txtTelefono = findViewById<EditText>(R.id.txtTelefono)

        val boton:Button = findViewById(R.id.btnIr)
        boton.setOnClickListener { view ->
            val intent = Intent(this, MainActivity2::class.java);
            intent.putExtra("id", "usuario123");
            intent.putExtra("edad", 42);
            intent.putExtra("localidad", "Parla");

            val nombre = txtNombre.text.toString()
            val curso = txtCurso.text.toString()
            val telefono = txtTelefono.text.toString()

            intent.putExtra("nombre", nombre)
            intent.putExtra("curso", curso)
            intent.putExtra("telefono", telefono)
            startActivity(intent);

        }
        }
    }

package com.example.navegar_alextashiguano

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val txtNombre1 = findViewById<TextView>(R.id.txtnombre1)
        val txtCurso1 = findViewById<TextView>(R.id.txtcurso1)
        val txtTelefono1 = findViewById<TextView>(R.id.txtTelefono1)

        val nombre = intent.getStringExtra("nombre")
        val curso = intent.getStringExtra("curso")
        val telefono = intent.getStringExtra("telefono")

        txtNombre1.text = nombre
        txtCurso1.text = curso
        txtTelefono1.text = telefono

        

        val extras = intent.extras
        val usuario = extras!!.getString("id")
        val edad = extras!!.getInt("edad")
        val localidad = extras!!.getString("localidad")

        val msg = "$usuario $edad $localidad"

        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()

    }
    }

package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var contadorInicial: EditText
    private lateinit var btnContador: Button
    private lateinit var btnCalculadora: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contadorInicial = findViewById(R.id.tv_valorinicial)
        btnContador = findViewById(R.id.btn_contador)
        btnCalculadora = findViewById(R.id.btn_calculadora)

        btnContador.setOnClickListener {
            val valorInicial = contadorInicial.text.toString()
            if (valorInicial.isNotEmpty()) {
                val intent = Intent(this, CounterActivity::class.java)
                intent.putExtra("valorInicial", valorInicial.toInt())
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Por favor, insira o valor inicial do contador", Toast.LENGTH_SHORT).show()
            }
        }

        btnCalculadora.setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }
    }
}


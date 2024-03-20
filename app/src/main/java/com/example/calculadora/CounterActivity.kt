package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CounterActivity : AppCompatActivity() {
    private lateinit var tvContador: TextView
    private lateinit var btnIncrementar: Button
    private lateinit var btnDecrementar: Button
    private lateinit var btnLimpar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        tvContador = findViewById(R.id.tv_contador)
        btnIncrementar = findViewById(R.id.btn_add)
        btnDecrementar = findViewById(R.id.btn_subtrair)
        btnLimpar = findViewById(R.id.btn_limpar)

        // Obter o valor inicial do contador da MainActivity
        val valorInicial = intent.getIntExtra("valorInicial", 0)
        tvContador.text = valorInicial.toString()

        btnIncrementar.setOnClickListener {
            val contadorAtual = tvContador.text.toString().toInt()
            tvContador.text = (contadorAtual + 1).toString()
        }

        btnDecrementar.setOnClickListener {
            val contadorAtual = tvContador.text.toString().toInt()
            if (contadorAtual > 0) {
                tvContador.text = (contadorAtual - 1).toString()
            }
        }
        btnLimpar.setOnClickListener{
            tvContador.text.toString().toInt()
            tvContador.text = (0).toString()
        }
    }
}

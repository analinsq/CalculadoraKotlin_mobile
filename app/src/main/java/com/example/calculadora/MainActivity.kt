package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val num1 = findViewById(R.id.tvPrimeiroValor) as EditText
        val num2 = findViewById(R.id.tvSegundoValor) as EditText
        val tot = findViewById(R.id.tvResultado) as EditText
        val bt1 = findViewById(R.id.btnSoma) as Button
        val bt2 = findViewById(R.id.btnSubt) as Button
        val bt3 = findViewById(R.id.btnMulti) as Button
        val bt4 = findViewById(R.id.btnDiv) as Button

        bt1.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 + val2

            tot.setText(result.toString())
        }

        bt2.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 - val2

            tot.setText(result.toString())
        }

        bt3.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 * val2

            tot.setText(result.toString())
        }

        bt4.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1/val2

            tot.setText(result.toString())
        }

    }
}
package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val valorInicial = intent.getDoubleExtra("initialValue", 0.0)

        val num1 = findViewById<EditText>(R.id.et_primeirovalor)
        val num2 = findViewById<EditText>(R.id.et_segundovalor)
        val tot = findViewById<EditText>(R.id.et_resultado)
        val btn1 = findViewById<Button>(R.id.btn_soma)
        val btn2 = findViewById<Button>(R.id.btn_subtracao)
        val btn3 = findViewById<Button>(R.id.btn_multiplicacao)
        val btn4 = findViewById<Button>(R.id.btn_divisao)

        btn1.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 + val2

            tot.setText(result.toString())
        }

        btn2.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 - val2

            tot.setText(result.toString())
        }

        btn3.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 * val2

            tot.setText(result.toString())
        }

        btn4.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1/val2

            tot.setText(result.toString())
        }


    }
}

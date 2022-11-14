package com.mella.intentexplicitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveAddNumber: Button = findViewById(R.id.btn_AddNumber)
        btnMoveAddNumber.setOnClickListener(this)

        val btnMoveAddText: Button = findViewById(R.id.btn_AddText)
        btnMoveAddText.setOnClickListener(this)

        val btnCalculatorRuang: Button = findViewById(R.id.btn_CalculatorRuang)
        btnCalculatorRuang.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_AddNumber -> {
                val moveAddNumber = Intent(this@MainActivity, MoveAddNumber::class.java)
                startActivity(moveAddNumber)
            }

            R.id.btn_AddText -> {
                val MoveAddText = Intent(this@MainActivity, MoveAddText::class.java)
                startActivity(MoveAddText)
            }

            R.id.btn_CalculatorRuang -> {
                val MoveCalculatorRuang = Intent(this@MainActivity, MoveCalculatorRuang::class.java)
                startActivity(MoveCalculatorRuang)
            }
        }
    }
}
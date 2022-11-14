package com.mella.intentexplicitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveCalculatorRuang : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtSisi: EditText
    private lateinit var btnHasil: Button
    private lateinit var tvHasiluas: TextView
    private lateinit var tvHasilVolume: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_calculator_ruang)

        edtSisi = findViewById(R.id.edt_sisi)
        btnHasil = findViewById(R.id.btn_Hasil)
        tvHasiluas = findViewById(R.id.tv_HasilLuas)
        tvHasilVolume = findViewById(R.id.tv_HasilVolume)

        btnHasil.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_Hasil) {
            val inputSisi = edtSisi.text.toString().trim()

            var isEmptyFields = false

            if (inputSisi.isEmpty()) {
                isEmptyFields = true
                edtSisi.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val luas = inputSisi.toDouble() * inputSisi.toDouble() * 6
                val volume = inputSisi.toDouble() * inputSisi.toDouble() * inputSisi.toDouble()
                tvHasiluas.text = luas.toString()
                tvHasilVolume.text = volume.toString()
            }
        }
    }
}

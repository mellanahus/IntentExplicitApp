package com.mella.intentexplicitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveAddText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_add_text)

        var sayHello : TextView = findViewById(R.id.tv_halo)
        var editName : EditText = findViewById(R.id.edt_name)
        var editNim : EditText = findViewById(R.id.edt_nim)
        var editProdi : EditText = findViewById(R.id.edt_prodi)
        var btnHello : Button = findViewById(R.id.btn_halo)

        btnHello.setOnClickListener{
            val namo = editName.text.toString()
            val nim = editNim.text.toString()
            val prodi = editProdi.text.toString()
            sayHello.text = "Hai selamat datang $namo di Prodi $prodi nim kamu $nim "
        }

    }
}
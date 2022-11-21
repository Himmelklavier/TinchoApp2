package com.example.tinchoapp2.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tinchoapp2.R

class RegistroActivity : AppCompatActivity() {
    lateinit var buttonRegistro: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        buttonRegistro = findViewById (R.id.btnRegistrarse)
        buttonRegistro.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))}
    }
}
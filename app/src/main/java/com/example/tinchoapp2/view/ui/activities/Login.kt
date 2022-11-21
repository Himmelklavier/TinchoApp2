package com.example.tinchoapp2.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tinchoapp2.R


class Login : AppCompatActivity() {

    lateinit var iniciobutton:Button
    lateinit var registrobutton:Button
    lateinit var recuperarbutton:TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        iniciobutton = findViewById(R.id.login)
        registrobutton = findViewById(R.id.signup)
        recuperarbutton = findViewById(R.id.btnrecuperar)
        iniciobutton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        registrobutton.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
        recuperarbutton.setOnClickListener {
            startActivity(Intent(this, RecuperarActivity::class.java))
        }




    }
}
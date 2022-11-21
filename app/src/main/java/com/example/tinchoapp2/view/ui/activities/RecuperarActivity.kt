package com.example.tinchoapp2.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tinchoapp2.R

class RecuperarActivity : AppCompatActivity() {
    lateinit var restaurarbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)
        restaurarbutton=findViewById(R.id.btnRestaurar)
        restaurarbutton.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}
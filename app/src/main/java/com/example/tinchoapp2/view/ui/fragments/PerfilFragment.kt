package com.example.tinchoapp2.view.ui.fragments

import android.content.Intent
import android.content.Intent.ACTION_PICK
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.tinchoapp2.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class PerfilFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<BottomNavigationView>(R.id.buttonNavigationMenu)
        button.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.menu -> findNavController().navigate(R.id.action_menuFragment_to_bebidasFragment)
            }
        }
        val botoncamara = view.findViewById<Button>(R.id.btncamara)
        botoncamara.setOnClickListener {
            val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,123)
        }
        val botongaleria = view.findViewById<Button>(R.id.btngaleria)
        botongaleria.setOnClickListener {
            val intent =Intent(ACTION_PICK)
            intent.type="image/*"
            startActivityForResult(intent,456)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageview=view?.findViewById<ImageView>(R.id.fotoperfil)
        if (requestCode==123){
            var bitmap=data?.extras?.get("data") as Bitmap
            imageview?.setImageBitmap(bitmap)
        } else if (requestCode==456)
            imageview?.setImageURI(data?.data)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_perfil, container, false)
        val nombreCompleto=view.findViewById<EditText>(R.id.nombrecompleto)
        val correoCompleto=view.findViewById<EditText>(R.id.correoelectronico)
        val telefonoCompleto=view.findViewById<EditText>(R.id.celularcompleto)
        val btneditnombre=view.findViewById<ImageButton>(R.id.nombreedit)
        val btneditcorreo=view.findViewById<ImageButton>(R.id.correoedit)
        val btnedittelefono=view.findViewById<ImageButton>(R.id.celularedit)
        nombreCompleto.isEnabled=false
        correoCompleto.isEnabled=false
        telefonoCompleto.isEnabled=false
        btneditnombre.setOnClickListener{
            if(nombreCompleto.isEnabled==false){
                nombreCompleto.isEnabled=true
            }else if (nombreCompleto.isEnabled==true){
                nombreCompleto.isEnabled=false
            }
        }
        btneditcorreo.setOnClickListener{
            if(correoCompleto.isEnabled==false){
                correoCompleto.isEnabled=true
            }else if (correoCompleto.isEnabled==true){
                correoCompleto.isEnabled=false
            }
        }
        btnedittelefono.setOnClickListener{
            if(telefonoCompleto.isEnabled==false){
                telefonoCompleto.isEnabled=true
            }else if (telefonoCompleto.isEnabled==true){
                telefonoCompleto.isEnabled=false
            }
        }
        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }

}
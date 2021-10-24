package com.example.holamundo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        if(v!=null){
            when(v.id){
                R.id.bt_cambiar_texto->{
                    val texto = findViewById<TextView>(R.id.textView)
                    texto.text="¡Hola Kotlin!"
                }
                R.id.bt_color ->{
                    val texto = findViewById<TextView>(R.id.textView)
                    texto.setTextColor(Color.BLUE)
                }
            }

        }
    }
}
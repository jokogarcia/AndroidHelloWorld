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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val textView = findViewById<TextView>(R.id.textView)
        outState.putString("contenidoTexto",textView.text.toString())
        outState.putInt("colorTexto",textView.currentTextColor)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState.containsKey("contenidoTexto")){
            val textView = findViewById<TextView>(R.id.textView)
            textView.text=savedInstanceState.getString("contenidoTexto")
            textView.setTextColor(savedInstanceState.getInt("colorTexto"))
        }
    }
}
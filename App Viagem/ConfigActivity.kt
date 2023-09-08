package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class ConfigActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.config_activity)
        Log.d("ConfigActivity", "onCreate called")
    }
    override fun onStart(){
        super.onStart()
        val editDestino =
            findViewById<EditText>(R.id.editDestino)
        val datePartida =
            findViewById<DatePicker>(R.id.datePartida)
        val dateRetorno =
            findViewById<DatePicker>(R.id.dateRetorno)
        val checkboxAventura =
            findViewById<CheckBox>(R.id.checkboxAventura)
        val checkboxRelaxante =
            findViewById<CheckBox>(R.id.checkboxRelaxante)
        val checkboxCultura =
            findViewById<CheckBox>(R.id.checkboxCultura)
        val checkboxPraia =
            findViewById<CheckBox>(R.id.checkboxPraia)
        val buttonConcluir =
            findViewById<Button>(R.id.buttonConcluir)
        var checkboxMarkCounter = arrayOf(0,0,0,0)

        buttonConcluir.setOnClickListener {
            val valDestino = editDestino.text.toString()
            val anoPartida = (datePartida.year).toString()
            val mesPartida = (datePartida.month+1).toString()
            val diaPartida = (datePartida.dayOfMonth).toString()
            val dataPartida = "$diaPartida/$mesPartida/$anoPartida"
            val anoRetorno = dateRetorno.year
            val mesRetorno = dateRetorno.month+1
            val diaRetorno = dateRetorno.dayOfMonth
            val dataRetorno = "$diaRetorno/$mesRetorno/$anoRetorno"
            checkboxMarkCounter[0] = if (checkboxAventura.isChecked) 1 else 0
            checkboxMarkCounter[1] = if (checkboxRelaxante.isChecked) 1 else 0
            checkboxMarkCounter[2] = if (checkboxCultura.isChecked) 1 else 0
            checkboxMarkCounter[3] = if (checkboxPraia.isChecked) 1 else 0
            val intent = Intent(this, AtividadesActivity::class.java)
            intent.putExtra("Destino",valDestino)
            intent.putExtra("DataPartida",dataPartida)
            intent.putExtra("DataRetorno",dataRetorno)
            intent.putExtra("Preferencias",checkboxMarkCounter)
            Log.d("ConfigActivity","Enviando Dados")
            startActivity(intent)
            finish()
        }
    }
}
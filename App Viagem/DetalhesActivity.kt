package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infoatividade_activity)
        val textTitle = intent.getStringExtra("NomeAtividade")
        val textDesc = intent.getStringExtra("TemaAtividade")
        val textLocl = intent.getStringExtra("Destino")
        val imagAtiv = intent.getIntExtra("ImageAtividade",R.drawable.montanha)
        val dataPartida = intent.getStringExtra("DataPartida")
        val dataRetorno = intent.getStringExtra("DataRetorno")

        val textNomeAtividade =
            findViewById<TextView>(R.id.textNomeAtividade)
        textNomeAtividade.setText(textTitle)
        val textTemaAtividade =
            findViewById<TextView>(R.id.textTemaAtividade)
        textTemaAtividade.setText(textDesc)
        val textLocalAtivadade =
            findViewById<TextView>(R.id.textLocal)
        textLocalAtivadade.setText(textLocl)
        val imageAtividade =
            findViewById<ImageView>(R.id.imageAtividade)
        imageAtividade.setImageResource(imagAtiv)
    }
    override fun onStart(){
        super.onStart()
        val textTitle = intent.getStringExtra("NomeAtividade")
        val textDesc = intent.getStringExtra("TemaAtividade")
        val textLocl = intent.getStringExtra("Destino")
        val imagAtiv = intent.getIntExtra("ImageAtividade",R.drawable.montanha)
        val dataPartida = intent.getStringExtra("DataPartida")
        val dataRetorno = intent.getStringExtra("DataRetorno")

        val buttonLockAtividade =
            findViewById<Button>(R.id.buttonLockAtividade)
        val seekDuracao =
            findViewById<SeekBar>(R.id.seekDuracao)

        buttonLockAtividade.setOnClickListener {

            val valDuracao = seekDuracao.progress.toString()

            val intent =
                Intent(this, RecapActivity::class.java)

            intent.putExtra("NomeAtividade",textTitle)
            intent.putExtra("TemaAtividade",textDesc)
            intent.putExtra("Destino",textLocl)
            intent.putExtra("ImageAtividade",imagAtiv)
            intent.putExtra("DataPartida",dataPartida)
            intent.putExtra("DataRetorno",dataRetorno)
            intent.putExtra("Duracao",valDuracao)

            startActivity(intent)
            finish()
        }
    }
}
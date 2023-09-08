package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RecapActivity:AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recap_activity)
        val textTitle = intent.getStringExtra("NomeAtividade")
        val textTema = intent.getStringExtra("TemaAtividade")
        val textDest = intent.getStringExtra("Destino")
        val imagAtiv = intent.getIntExtra("ImageAtividade",R.drawable.montanha)
        val dataPartida = intent.getStringExtra("DataPartida")
        val dataRetorno = intent.getStringExtra("DataRetorno")
        val imagAtividade =
            findViewById<ImageView>(R.id.imageRecapViagem)
        imagAtividade.setImageResource(imagAtiv)
        val textLocd =
            findViewById<TextView>(R.id.textTitleRecapViagem)
        textLocd.setText("Viagem para $textDest!")
        val dataViag =
            findViewById<TextView>(R.id.textPeriodoViagem)
        dataViag.setText("$dataPartida / $dataRetorno")
        val textTem =
            findViewById<TextView>(R.id.textTemaViagem)
        textTem.setText(textTema)
        val textNomeAtividade =
            findViewById<TextView>(R.id.textNomeAtividadeRecap)
        textNomeAtividade.setText(textTitle)
    }

    override fun onStart() {
        super.onStart()

        val buttonConfirmar =
            findViewById<Button>(R.id.buttonConfirm)
        buttonConfirmar.setOnClickListener {
            Toast.makeText(this, "Viagem Confirmada", Toast.LENGTH_SHORT).show()
            val intent =
                Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
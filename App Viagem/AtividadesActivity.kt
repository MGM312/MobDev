package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class AtividadesActivity:AppCompatActivity() {
    val atividadesArray: ArrayList<AtividadesModel> = ArrayList<AtividadesModel>()
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.atividades_activity)
        Log.d("AtividadesActivity","OnCreate Called")


        val atividadesRV =
            findViewById<RecyclerView>(R.id.recyclerAtividades)

        atividadesArray.add(AtividadesModel("Escalar Montanha","Aventura",R.drawable.montanha))
        atividadesArray.add(AtividadesModel("Dia no Spa","Relaxante",R.drawable.relaxante))
        atividadesArray.add(AtividadesModel("Show de Musica","Cultura",R.drawable.showmusica))
        atividadesArray.add(AtividadesModel("Praia com um nome legal","Praia",R.drawable.praia))

        val atividadeAdapter = AtividadesAdapter(this,atividadesArray)

        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        atividadesRV.layoutManager = linearLayoutManager
        atividadesRV.adapter = atividadeAdapter


    }

    fun onSelectClicked(position:Int) {
        val valDestino = intent.getStringExtra("Destino")
        val dataPartida = intent.getStringExtra("DataPartida")
        val dataRetorno = intent.getStringExtra("DataRetorno")

        val intent =
            Intent(this, DetalhesActivity::class.java)
        val nomeAtividade = atividadesArray[position].getNome_atividade()
        val temaAtividade = atividadesArray[position].getTema_atividade()
        val imagAtividade = atividadesArray[position].getFoto_atividade()
        intent.putExtra("NomeAtividade",nomeAtividade)
        intent.putExtra("TemaAtividade",temaAtividade)
        intent.putExtra("ImageAtividade",imagAtividade)
        intent.putExtra("Destino",valDestino)
        intent.putExtra("DataPartida",dataPartida)
        intent.putExtra("DataRetorno",dataRetorno)
        startActivity(intent)
        finish()
    }
}
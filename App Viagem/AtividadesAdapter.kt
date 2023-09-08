package com.example.myapplication;

import android.content.Context;
import android.media.Image
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.view.menu.ActionMenuItemView

import java.util.ArrayList;

class AtividadesAdapter(private val contexto: Context, atividadesArrayList:ArrayList<AtividadesModel>):
    RecyclerView.Adapter<AtividadesAdapter.Viewholder>() {
        private val atividadesArrayList: ArrayList<AtividadesModel>
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AtividadesAdapter.Viewholder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: AtividadesAdapter.Viewholder, position: Int) {
        val model: AtividadesModel = atividadesArrayList[position]
        holder.nome_atividadeTV.setText(model.getNome_atividade())
        holder.tema_atividadeTV.setText(model.getTema_atividade())
        holder.foto_atividadeIV.setImageResource(model.getFoto_atividade())
        holder.select_atividadeBT.setOnClickListener {
            (holder.itemView.context as AtividadesActivity).onSelectClicked(position)
        }
    }

    override fun getItemCount(): Int {
        return atividadesArrayList.size
    }

    class Viewholder(itemView: View): RecyclerView.ViewHolder(itemView){
         val nome_atividadeTV: TextView
         val tema_atividadeTV: TextView
         val foto_atividadeIV: ImageView
         val select_atividadeBT: Button
        init {
            foto_atividadeIV = itemView.findViewById(R.id.imageCard)
            tema_atividadeTV = itemView.findViewById(R.id.textCard)
            nome_atividadeTV = itemView.findViewById(R.id.textTitleCard)
            select_atividadeBT = itemView.findViewById(R.id.buttonSelecionarAtividade)
        }
    }

    init {
        this.atividadesArrayList = atividadesArrayList
    }
}
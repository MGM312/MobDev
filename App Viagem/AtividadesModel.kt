package com.example.myapplication

class AtividadesModel(private var nome_atividade: String,private var tema_atividade: String, private var foto_atividade: Int) {

    fun getNome_atividade():String{
        return nome_atividade
    }
    fun setNome_atividade(nome_atividade: String){
        this.nome_atividade = nome_atividade
    }
    fun getTema_atividade():String{
        return tema_atividade
    }
    fun setTema_atividade(tema_atividade: String){
        this.tema_atividade = tema_atividade
    }
    fun getFoto_atividade():Int{
        return foto_atividade
    }
    fun setFoto_atividade(foto_atividade: Int){
        this.foto_atividade = foto_atividade
    }
}
package com.example.myapplication

import android.util.Log
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        Log.d("HomeActivity", "onCreate called")
        val username =
            intent.getStringExtra("username")
        val welcome =
            findViewById<TextView>(R.id.messageBemVindo)
        welcome.setText("Bem Vindo $username!")
        val buttonLogout =
            findViewById<Button>(R.id.buttonLogout)
        buttonLogout.setOnClickListener{
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override  fun onStart(){
        super.onStart()
        Log.d("HomeActivity", "OnStart called")
    }
    override fun onResume(){
        super.onResume()
        Log.d("HomeActivity","OnResume called")
    }
    override fun onPause(){
        super.onPause()
        Log.d("HomeActivity", "OnPause called")
    }
    override fun onStop(){
        super.onStop()
        Log.d("HomeActivity", "OnStop called")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("HomeActivity","OnDestroy called")
    }
}
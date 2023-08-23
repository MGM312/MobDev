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
            intent.putExtra("username",username)
            Log.d("HomeActivity", "Sending username: $username")
            startActivity(intent)
            finish()
        }
    }
}
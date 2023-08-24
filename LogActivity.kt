package com.example.myapplication

import android.util.Log
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LogActivity : AppCompatActivity() {
    private var holdUser: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_activity)
        Log.d("LogActivity", "OnCreate called")
    }

    override fun onStart(){
        super.onStart()
        Log.d("LogActivity", "OnStart called")
        val editTextEmail =
            findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword =
            findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin =
            findViewById<Button>(R.id.buttonLogin)
        buttonLogin.setOnClickListener{
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
                if (email.isNotBlank() && password == "123"){
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("username",email)
                    startActivity(intent)
                }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("LogActivity", "OnResume called")

    }

    override fun onPause(){
        super.onPause()
        Log.d("LogActivity", "OnPause called")
    }

    override fun onStop(){
        super.onStop()
        Log.d("LogActivity", "OnStop called")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("LogActivity","OnDestroy called")
    }

}
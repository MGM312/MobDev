package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LinearActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_activity)
        Log.d("LinearActivity", "onCreate called")
        val buttonSair =
            findViewById<Button>(R.id.buttonSairLinear)
        buttonSair.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonRelative =
            findViewById<Button>(R.id.buttonIntoRelativeLinear)
        buttonRelative.setOnClickListener {
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonConstraint =
            findViewById<Button>(R.id.buttonIntoConstraintLinear)
        buttonConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonTable =
            findViewById<Button>(R.id.buttonIntoTableLinear)
        buttonTable.setOnClickListener{
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
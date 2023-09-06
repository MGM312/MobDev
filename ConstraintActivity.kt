package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConstraintActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_activity)
        Log.d("ConstraintActivity", "onCreate called")
        val buttonSair =
            findViewById<Button>(R.id.buttonSairConstraint)
        buttonSair.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonLinear =
            findViewById<Button>(R.id.buttonIntoLinearConstraint)
        buttonLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonRelative =
            findViewById<Button>(R.id.buttonIntoRelativeConstraint)
        buttonRelative.setOnClickListener {
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonTable =
            findViewById<Button>(R.id.buttonIntoTableConstraint)
        buttonTable.setOnClickListener{
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
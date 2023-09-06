package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TableActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.table_activity)
        Log.d("RelativeActivity", "onCreate called")
        val buttonSair =
            findViewById<Button>(R.id.buttonSairTable)
        buttonSair.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonLinear =
            findViewById<Button>(R.id.buttonIntoLinearTable)
        buttonLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonConstraint =
            findViewById<Button>(R.id.buttonIntoConstraintTable)
        buttonConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonRelative =
            findViewById<Button>(R.id.buttonIntoRelativeTable)
        buttonRelative.setOnClickListener{
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
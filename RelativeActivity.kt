package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RelativeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_activity)
        Log.d("RelativeActivity", "onCreate called")
        val buttonSair =
            findViewById<Button>(R.id.buttonSairRelative)
        buttonSair.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonLinear =
            findViewById<Button>(R.id.buttonIntoLinearRelative)
        buttonLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonConstraint =
            findViewById<Button>(R.id.buttonIntoConstraintRelative)
        buttonConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
            finish()
        }
        val buttonTable =
            findViewById<Button>(R.id.buttonIntoTableRelative)
        buttonTable.setOnClickListener{
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
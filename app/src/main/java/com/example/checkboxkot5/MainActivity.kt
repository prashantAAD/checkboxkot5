package com.example.checkboxkot5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val check1 = findViewById<CheckBox>(R.id.kotlin)
        val check2 = findViewById<CheckBox>(R.id.java)
        val bt = findViewById<Button>(R.id.button)
        bt.setOnClickListener {
            if (check1.isChecked && check2.isChecked) {
                Toast.makeText(this@MainActivity, "kotlin+java", Toast.LENGTH_LONG).show()
            } else if (check2.isChecked) {
                Toast.makeText(this@MainActivity, "java", Toast.LENGTH_LONG).show()
            } else if (check1.isChecked) {
                Toast.makeText(this@MainActivity, "kotlin", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this@MainActivity, "nothing selected", Toast.LENGTH_LONG).show()
            }
        }
    }
}
package com.ltts.gproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_g2.*
import kotlinx.android.synthetic.main.activity_main.*

class G2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g2)
        buttonp.setOnClickListener {
            var un1 = editTextTextPersonName.text.toString()
            Toast.makeText(this, "LOGIN BUTTON CLICKED", Toast.LENGTH_LONG).show()
            editTextTextPersonName.setText(un1)
            var myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
        buttonn.setOnClickListener {
            var un2 = editTextTextPersonName.text.toString()
            Toast.makeText(this, "LOGIN BUTTON CLICKED", Toast.LENGTH_LONG).show()
            editTextTextPersonName.setText(un2)
            var myIntent = Intent(this,G3::class.java)
            startActivity(myIntent)
        }
    }
}
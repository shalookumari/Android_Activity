package com.ltts.gproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_g3.*
import kotlinx.android.synthetic.main.activity_main.*

class G3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g3)
        buttonh.setOnClickListener {
            var un3 = editTextTextPersonName.text.toString()
            Toast.makeText(this, "LOGIN BUTTON CLICKED", Toast.LENGTH_LONG).show()
            editTextTextPersonName.setText(un3)
            var myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
        buttonp.setOnClickListener {
            var un4 = editTextTextPersonName.text.toString()
            Toast.makeText(this, "LOGIN BUTTON CLICKED", Toast.LENGTH_LONG).show()
            editTextTextPersonName.setText(un4)
            var myIntent = Intent(this,G2::class.java)
            startActivity(myIntent)
        }

    }
}
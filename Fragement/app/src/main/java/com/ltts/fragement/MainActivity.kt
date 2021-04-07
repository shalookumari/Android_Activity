package com.ltts.fragement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRed.setOnClickListener { it:View!
            supportFragmentManager.beginTransaction().replace(R.id.fragment_green, RedFragment()).commit()
        }
            buttonBlue.setOnClickListener{it:view!
            var blueFrag=BlueFragment()
            var myManager=supportFragmentManager()
            var myTransactions:FragmentTransaction

        }
        butt
    }
}
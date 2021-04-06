package com.example.genrecyclerviewproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv = findViewById<RecyclerView>(R.id.myrecyclerview)

        myrv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var myDatalist = ArrayList<UsersData>()

        myDatalist.add(UsersData("shaloo","s@gamil.com","989999999"))
        myDatalist.add(UsersData("akash","akash@gamil.com","6997877"))
        myDatalist.add(UsersData("rohit","rohit@gamil.com","9454834543"))
        myDatalist.add(UsersData("vinay","vinay@gamil.com","777644545"))
        myDatalist.add(UsersData("aman","am@gamil.com","777644545"))

            myrv.adapter = MyAdapter(myDatalist)

    }
}
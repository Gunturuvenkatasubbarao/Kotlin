package com.ltts.student_information

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyRecycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler)

        var mrv =findViewById<RecyclerView>(R.id.myrecyclerview)
        mrv.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        var mydata=ArrayList<Data>()
        mydata.add(Data("Subbu","gvs@gmail.com","9876543210"))
        mydata.add(Data("kiran","kiran@gmail.com","9123456780"))
        mydata.add(Data("Mahesh","mgh@gmail.com","6987541230"))


        mrv.adapter= MyAdapter(mydata)
    }
}

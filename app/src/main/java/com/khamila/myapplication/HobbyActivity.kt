package com.khamila.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {
    lateinit var hobbyView: RecyclerView
    lateinit var hobbyAdapter: HobbyAdapter
    val list = ArrayList<HobbyData>()



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvHobby)
        hobbyView.layoutManager = LinearLayoutManager(this)

        list.add(HobbyData("Menonton", "Drama Korea VICENZO"))
        list.add(HobbyData("Memasak", "Mie Goreng"))

        hobbyAdapter = HobbyAdapter(list)
        hobbyView.adapter = hobbyAdapter
    }
}
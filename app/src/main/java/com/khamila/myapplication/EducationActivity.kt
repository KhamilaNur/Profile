package com.khamila.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SDN Daleman", "Daleman, Kec. Sayung, Kab. Demak"))
        list.add(SchoolData("SMPN 2 Sayung", "Jl. Raya Sayung"))
        list.add(SchoolData("SMKN 1 Sayung", "JL.Semarang Demak KM.14 Sayung-Demak"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter

    }
}
package com.khamila.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(PortofolioData(
            R.drawable.web, "LKS Android",
            "Sistem Manajemen Keuangan Depot Air", "https://github.com/KhamilaNur/JOBSHEET-10"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "LKS Android",
            "Project latihan LKS bidang android", "https://github.com/KhamilaNur/JOBSHEET8"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "LKS Android",
            "Project latihan LKS bidang android", "https://github.com/KhamilaNur/JOBSHEET9"
        ))

        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter

    }
}




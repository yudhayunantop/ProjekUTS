package com.dicoding.picodiploma.projekuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFakultas: RecyclerView
    private var list: ArrayList<fakultas> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)

        rvFakultas = findViewById(R.id.rv_fakultas)
        rvFakultas.setHasFixedSize(true)

        list.addAll(DataFakultas.listFakultas)
        showRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private var title: String = "UPN 'VETERAN' Jawa Timur"

    private fun showSelectedFakultas(fakultas: fakultas) {
        Toast.makeText(this, "Kamu memilih " + fakultas.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        rvFakultas.layoutManager = LinearLayoutManager(this)
        val listFakultasAdapter = ListFakultasAdapter(list)
        rvFakultas.adapter = listFakultasAdapter

        listFakultasAdapter.setOnItemClickCallback(object : ListFakultasAdapter.OnItemClickCallback {
            override fun onItemClicked(data: fakultas) {
                showSelectedFakultas(data)
                showSelected(data)
            }
        })
    }

    private fun showSelected(fakultas: fakultas) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.NAMA, fakultas.name)
        intent.putExtra(DetailActivity.DETAIL, fakultas.detail)
        intent.putExtra(DetailActivity.PHOTO, fakultas.photo)
        //startActivity(intent)
    }
}
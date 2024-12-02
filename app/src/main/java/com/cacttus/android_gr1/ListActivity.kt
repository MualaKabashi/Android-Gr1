package com.cacttus.android_gr1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity

class ListActivity : ComponentActivity() {
    private lateinit var list: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)
        list = findViewById(R.id.list)

        var adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listOf("Eriol", "Enis", "Medina", "Olti")
        )
        list.adapter = adapter
    }
}
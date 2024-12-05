package com.cacttus.android_gr1

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.cacttus.android_gr1.adapters.SingerAdapter
import com.cacttus.android_gr1.models.Singer

class ComplexListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.complex_list_layout)

        var complexList = findViewById<ListView>(R.id.complex_list)

        var singerList = listOf(
            Singer(R.drawable.singer_1, name = "Elinel", 35),
            Singer(R.drawable.singer_2, "Noizy", 36),
            Singer(R.drawable.singer_3, "Mc Kresha", 43),
            Singer(R.drawable.singer_4, "Lyrical Son", 38),
            Singer(R.drawable.singer_5, "Shkurte Fejza", 63),
            Singer(R.drawable.singer_6, "Sabri Fejzullahu", 77),
            Singer(R.drawable.singer_7, "Adele", 36),
            Singer(R.drawable.singer_8, "Rihanna", 36),
            Singer(R.drawable.singer_9, "Dua Lipa", 29),
        )

        var singerAdapter = SingerAdapter(this, singerList)
        complexList.adapter = singerAdapter

        complexList.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${singerList[position].name} is clicked", Toast.LENGTH_LONG)
                .show()

            var intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("photo", singerList[position].photo)
            intent.putExtra("name", singerList[position].name)
            startActivity(intent)
        }

    }
}
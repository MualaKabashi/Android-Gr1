package com.cacttus.android_gr1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singer_details_layout)

        var image = findViewById<ImageView>(R.id.details_profile_image)
        var name = findViewById<TextView>(R.id.details_name)

        image.setImageResource(intent.getIntExtra("photo", 0))
        name.text = intent.getStringExtra("name")
    }
}
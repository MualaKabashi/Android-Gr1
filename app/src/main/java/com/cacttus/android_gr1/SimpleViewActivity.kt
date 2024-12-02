package com.cacttus.android_gr1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class SimpleViewActivity : ComponentActivity() {
    private lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_layout)

        description = findViewById(R.id.simple_text)

        var user = intent.getStringExtra("name")
        var passedDescription = intent.getStringExtra("description")

        description.text = user + "\n" + passedDescription
    }
}
package com.cacttus.android_gr1

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : ComponentActivity() {
    private lateinit var editText: EditText
    private lateinit var button: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)

        bindViews()

        button.setOnClickListener {
            editText.setText(button.text)
        }
    }
    fun bindViews(){
        editText = findViewById(R.id.number)
        button = findViewById(R.id.btn4)
    }
}


package com.cacttus.android_gr1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class ProfileActivity : ComponentActivity() {
    private lateinit var username: TextView
    private lateinit var likeButton: AppCompatButton
    private lateinit var commentButton: AppCompatButton
    private lateinit var shareButton: AppCompatButton
    private lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        bindViews()

        var passedArgument = intent.getStringExtra("username")
        username.text = passedArgument

        likeButton.setOnClickListener {
            Toast.makeText(this, "Like button clicked", Toast.LENGTH_LONG).show()
        }

        commentButton.setOnClickListener {
            Toast.makeText(this, "Comment button clicked", Toast.LENGTH_LONG).show()
        }

        shareButton.setOnClickListener {
            Toast.makeText(this, "Share button clicked", Toast.LENGTH_LONG).show()
            var shareIntent = Intent(this, SimpleViewActivity::class.java)
            shareIntent.putExtra("name", username.text.toString())
            shareIntent.putExtra("description", description.text.toString())
            startActivity(shareIntent)
        }

    }

    fun bindViews() {
        username = findViewById(R.id.profile_name)
        likeButton = findViewById(R.id.btn_like)
        commentButton = findViewById(R.id.btn_comment)
        shareButton = findViewById(R.id.btn_share)
        description = findViewById(R.id.description)
    }
}
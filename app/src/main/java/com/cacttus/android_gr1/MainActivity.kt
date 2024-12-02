package com.cacttus.android_gr1

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : ComponentActivity() {
//    private lateinit var editText: EditText
//    private lateinit var button: AppCompatButton
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.calculator_layout)
//
//        bindViews()
//
//        button.setOnClickListener {
//            editText.setText(button.text)
//        }
//    }
//    fun bindViews(){
//        editText = findViewById(R.id.number)
//        button = findViewById(R.id.btn4)
//    }

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: AppCompatButton
    private lateinit var forgetPassword: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        bindView()


        loginButton.setOnClickListener {
            if (username.text.toString().isNotEmpty() && password.text.toString()
                    .isNotEmpty() && textValidation(password.text.toString())
            ) {
                Toast.makeText(
                    this,
                    "${username.text} is logged in successfully",
                    Toast.LENGTH_LONG
                )
                    .show()

                var intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("username", username.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter your credentials!", Toast.LENGTH_SHORT).show()
            }
        }

        forgetPassword.setOnClickListener {
            createAlertDialog()
        }
    }

    private fun bindView() {
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.login)
        forgetPassword = findViewById(R.id.forgotPassword)
    }


    private fun createAlertDialog() {
        var builder = AlertDialog.Builder(this)
        builder.setTitle("ResetPassword")
        builder.setMessage("Are you sure you want to reset your password?")

        builder.setPositiveButton("Ok") { it, it1 ->
            Toast.makeText(this, "A reset link was sent to your email!", Toast.LENGTH_LONG)
                .show()
        }

        builder.setNeutralButton("Cancel") { it, it1 ->
            Toast.makeText(this, "Canceled", Toast.LENGTH_LONG).show()
        }

        var alert = builder.create()
        alert.setCancelable(false)
        alert.show()
    }

    fun textValidation(input: String): Boolean = input.length >= 8 && input[0].isUpperCase()

}


package com.example.ejercicio10

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private var usernameEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var verifyButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        verifyButton = findViewById(R.id.verifyButton)
        verifyButton?.setOnClickListener(View.OnClickListener {
            val username = usernameEditText?.text.toString()
            val password = passwordEditText?.text.toString()
            if (username == "admin" && password == "admin") {
                Toast.makeText(this@MainActivity, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "No se puede ingresar sin la clave", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
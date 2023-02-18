
package com.example.text


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import android.view.View
import android.widget.Button
import android.widget.EditText




class MainActivity : AppCompatActivity() {

    private var usernameEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var verifyButton: Button? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {


        menuInflater.inflate(R.menu.menu_main, menu)




        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_option1 -> {
                Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_option2 -> {
                Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu_option3 -> {
                Toast.makeText(this, "Opción 3", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.telefono -> {
                Toast.makeText(this, "Presiono el telefono", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.camara -> {
                Toast.makeText(this, "Presiono la cámara", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }




    }














}






package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    var t1: EditText? = null
    var t2: EditText? = null
    var b2: Button? = null
    var b1: Button? = null

    var firebaseAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAuth = FirebaseAuth.getInstance()
        t1 = findViewById<View>(R.id.nameid) as EditText
        t2 = findViewById<View>(R.id.passw) as EditText
        b2 = findViewById<View>(R.id.msg) as Button
        b1 = findViewById<View>(R.id.signup) as Button

        b1!!.setOnClickListener { rnu() }

        b2!!.setOnClickListener {
            signIn()
        }
    }

    fun rnu() {
        val email: String
        val password: String
        email = t1!!.text.toString()
        password = t2!!.text.toString()
        firebaseAuth!!.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        applicationContext,
                        "Registration successful!",
                        Toast.LENGTH_LONG
                    ).show()
                } else {

                    // Registration failed
                    Toast.makeText(
                        applicationContext, "Registration failed!!"
                                + " Please try again later",
                        Toast.LENGTH_LONG
                    )
                        .show()
                }
            }
    }

    private fun signIn() {
        val intent = Intent(this, Signin::class.java)
        startActivity(intent)
        finish()
    }
}
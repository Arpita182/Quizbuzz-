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

class Signin: AppCompatActivity() {
    var t1: EditText? = null
    var t2: EditText? = null
    var b1: Button? = null
    var firebaseAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        firebaseAuth = FirebaseAuth.getInstance()
        t1 = findViewById<View>(R.id.nameid) as EditText?
        t2 = findViewById<View>(R.id.passw) as EditText
        b1 = findViewById<View>(R.id.button_start) as Button?

        b1!!.setOnClickListener { rnu() }
    }

    fun rnu() {
        val email: String
        val password: String
        email = t1!!.text.toString()
        password = t2!!.getText().toString()
        firebaseAuth!!.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent = Intent(getApplicationContext(), CategoryActivity::class.java)
                    startActivity(intent)
                } else {

                    // Registration failed
                    Toast.makeText(
                        getApplicationContext(),
                        "Record Not Found",
                        Toast.LENGTH_LONG
                    )
                        .show()
                }
            }
    }
}

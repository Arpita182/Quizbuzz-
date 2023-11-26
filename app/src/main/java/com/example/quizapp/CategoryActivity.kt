package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.ui.LitActivity
import com.example.quizapp.ui.MonuActivity
import com.example.quizapp.ui.QuestionsActivity
import com.example.quizapp.ui.SportsActivity
import com.example.quizapp.ui.cntryActivity
import com.example.quizapp.utils.Constants

class CategoryActivity : AppCompatActivity() {
    var cntry: Button? = null
    var sports: Button? = null
    var monu: Button? = null
    var lit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        cntry = findViewById<View>(R.id.cntry) as Button
        sports = findViewById<View>(R.id.sports) as Button
        monu = findViewById<View>(R.id.monu) as Button
        lit = findViewById<View>(R.id.lit) as Button

        cntry!!.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    cntryActivity::class.java
                )
            )
        }
        sports!!.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SportsActivity::class.java
                )
            )
        }
        monu!!.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MonuActivity::class.java
                )
            )
        }
        lit!!.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    LitActivity::class.java
                )
            )
        }
    }
}
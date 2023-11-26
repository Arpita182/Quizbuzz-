package com.example.quizapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.CategoryActivity
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.example.quizapp.utils.Constants

class ResultActivity : AppCompatActivity() {
    private lateinit var textViewScore:TextView
    private lateinit var textViewName: TextView
    private lateinit var retake: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

      textViewScore = findViewById(R.id.textview_score)
      textViewName = findViewById(R.id.textview_name)
        retake= findViewById(R.id.retake)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val score = intent.getIntExtra(Constants.SCORE,0)
        val name = intent.getStringExtra(Constants.USER_NAME)

        textViewScore.text = "Your score is $score out of $totalQuestions"
        textViewName.text = name

        retake.setOnClickListener {
            Intent(this, CategoryActivity::class.java).also{
                startActivity(it)
            }
        }



        }

    }


package com.example.quizapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.CategoryActivity
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.example.quizapp.utils.CountryCons

class cnResult : AppCompatActivity() {
    private lateinit var textViewScore:TextView
    private lateinit var retake: Button
    private lateinit var finish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cn_result)

        textViewScore = findViewById(R.id.textview_score)
        retake= findViewById(R.id.retake)
        finish= findViewById(R.id.finish_button)

        val totalQuestions = intent.getIntExtra(CountryCons.TOTAL_QUESTIONS,0)
        val score = intent.getIntExtra(CountryCons.SCORE,0)

        textViewScore.text = "Your score is $score out of $totalQuestions"

        retake.setOnClickListener {
            Intent(this, CategoryActivity::class.java).also{
                startActivity(it)
            }
        }

        finish.setOnClickListener {
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }
        }

    }
}
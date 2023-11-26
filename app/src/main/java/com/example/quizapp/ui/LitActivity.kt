package com.example.quizapp.ui

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.quizapp.R
import com.example.quizapp.model.Question
import com.example.quizapp.utils.Constants
import com.example.quizapp.utils.CountryCons
import com.example.quizapp.utils.litCons

class LitActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var progressBar: ProgressBar
    private lateinit var textViewProgress:TextView
    private lateinit var textViewQuestion: TextView
    private lateinit var imagepic: ImageView

    private lateinit var textViewOption1: TextView
    private lateinit var textViewOption2: TextView
    private lateinit var textViewOption3: TextView
    private lateinit var textViewOption4: TextView
    private lateinit var checkButton: Button

    private var questionsCounter = 0
    private var questionsList: MutableList<Question> = mutableListOf()
    private var selectedAnswer = 0
    private var currentQuestion: Question? = null
    private var answered = false
    private var name = ""
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cntry)

        progressBar =findViewById(R.id.progressBar)
        textViewProgress= findViewById(R.id.text_view_progress)
        textViewQuestion= findViewById(R.id.question_text_view)
        imagepic= findViewById(R.id.image_flag)
        checkButton= findViewById(R.id.button_check)

        textViewOption1 = findViewById(R.id.text_view_option1)
        textViewOption2 = findViewById(R.id.text_view_option2)
        textViewOption3 = findViewById(R.id.text_view_option3)
        textViewOption4 = findViewById(R.id.text_view_option4)

        textViewOption1.setOnClickListener(this)
        textViewOption2.setOnClickListener(this)
        textViewOption3.setOnClickListener(this)
        textViewOption4.setOnClickListener(this)
        checkButton.setOnClickListener(this)

        questionsList = litCons.getQuestions()
        Log.d("QuestionSize","${questionsList.size}")

        setQuestion()
        if(intent.hasExtra(litCons.USER_NAME)){
            name = intent.getStringExtra(litCons.USER_NAME)!!
        }

    }

    private fun setQuestion() {


        if (questionsCounter < questionsList.size) {
            currentQuestion = questionsList[questionsCounter]
            checkButton.text = "CHECK"

            resetOptions()
            val question = questionsList[questionsCounter]
            imagepic.setImageResource(question.image)
            progressBar.progress = questionsCounter+1
            textViewProgress.text = "${questionsCounter+1}/${progressBar.max}"
            textViewQuestion.text = question.question
            textViewOption1.text = question.optionOne
            textViewOption2.text = question.optionTwo
            textViewOption3.text = question.optionThree
            textViewOption4.text = question.optionFour

        } else {
            checkButton.text = "FINISH"

            Intent(this, cnResult::class.java).also{
                it.putExtra(litCons.USER_NAME, name)
                it.putExtra(litCons.SCORE, score)
                it.putExtra(litCons.TOTAL_QUESTIONS, questionsList.size)

                startActivity(it)
            }
        }
        questionsCounter++
        answered = false
    }

    private fun resetOptions(){
        val options = mutableListOf<TextView>()
        options.add(textViewOption1)
        options.add(textViewOption2)
        options.add(textViewOption3)
        options.add(textViewOption4)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_optionborder_bg
            )
        }
    }

    private fun selectedOption(textView: TextView, selectOptionNumber : Int){
        resetOptions()

        selectedAnswer = selectOptionNumber
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface,Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_optionborder_bg
        )
    }
    override fun onClick(view: View?){
        when(view?.id){

            R.id.text_view_option1 -> {
                selectedOption(textViewOption1, 1)
            }
            R.id.text_view_option2 -> {
                selectedOption(textViewOption2, 2)
            }
            R.id.text_view_option3 -> {
                selectedOption(textViewOption3, 3)
            }
            R.id.text_view_option4 -> {
                selectedOption(textViewOption4, 4)
            }
            R.id.button_check -> {
                if(!answered){
                    checkAnswer()
                }else{
                    setQuestion()
                }
                selectedAnswer= 0
            }
        }
    }

    private fun checkAnswer() {
        answered = true

        if(selectedAnswer == currentQuestion!!.correctAnswer) {
            highlightAnswer(selectedAnswer)
            score++
            answered = true
        }

        else {
            answered = true
            when(selectedAnswer) {
                1 -> {
                    textViewOption1.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_optionborder_bg
                    )
                }

                2 -> {
                    textViewOption2.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_optionborder_bg
                    )
                }

                3 -> {
                    textViewOption3.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_optionborder_bg
                    )
                }

                4 -> {
                    textViewOption4.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_optionborder_bg
                    )
                }
            }
        }
        checkButton.text= "NEXT"
        showSolution()
    }

    private fun showSolution() {
        selectedAnswer = currentQuestion!!.correctAnswer
        highlightAnswer(selectedAnswer)
    }
    private fun highlightAnswer(answer:Int){
        when(answer) {
            1 -> {
                textViewOption1.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.correct_optionborder_bg
                )
            }

            2 -> {
                textViewOption2.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.correct_optionborder_bg
                )
            }

            3 -> {
                textViewOption3.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.correct_optionborder_bg
                )
            }

            4 -> {
                textViewOption4.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.correct_optionborder_bg
                )
            }
        }
    }
}

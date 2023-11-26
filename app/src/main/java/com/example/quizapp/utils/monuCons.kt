package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object monuCons {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question>{
        val questions = mutableListOf<Question>()


        val ques1 = Question(
            1,"Which country does this monument belong to?",
            R.drawable.christ_the_redeemer_statue_rio_de_janeiro_brazil,
            "Rome,Italy", "New York,US",
            "Rio de Janeiro,Brazil", "Paris, France",
            3
        )
        questions.add(ques1)


        val ques2 = Question(
            2, "Which state of India does this monument belong to? ",
            R.drawable.victoriamemorial, "Mumbai","Chhattisgarh",
            "Delhi","Kolkata", 4
        )
        questions.add(ques2)

        val ques3 = Question(
            3, "Where is Leaning Tower situated? ",
            R.drawable.lean, "Pisa","Montreal",
            "Shanghai","Kathmandu", 1
        )
        questions.add(ques3)

        val ques4 = Question(
            4, "Which of the following is the oldest stone structures in India? ",
            R.drawable.redf, "Taj","Qutub Minar",
            "Red Fort","Sanchi", 4
        )
        questions.add(ques4)

        val ques5 = Question(
            5, "The Great Barrier Reef is a natural landmark in which country?",
            R.drawable.gbr, "New Zealand","Australia",
            "Papua New Guinea","Thailand", 2
        )
        questions.add(ques5)

        return questions
    }
}
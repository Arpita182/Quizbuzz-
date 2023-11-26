package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object spConstants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question>{
        val questions = mutableListOf<Question>()

        val ques1 = Question(
            1, "Commonwealth Games started from which country? ",
            R.drawable.cg, "England","Australia",
            "Canada","India", 3
        )
        questions.add(ques1)

        val ques2 = Question(
            2, "Which game first started in India? ",
            R.drawable.gms, "Cricket","Baseball",
            "Badminton","Chess", 4
        )
        questions.add(ques2)

        val ques3 = Question(
            3, "Rovers Cup is related to which of the following sports?",
            R.drawable.gms, "Football","Cricket",
            "Hockey","Tennis", 1
        )
        questions.add(ques3)

        val ques4 = Question(
            4, "'Ice Hockey' is the national sport of which country?",
            R.drawable.gms, "Sweden","Canada",
            "Denmark","Scotland", 2
        )
        questions.add(ques4)

        val ques5 = Question(
            5, "Who started the practice of the polo game in India?",
            R.drawable.gms, "Portuguese","Unani",
            "English","Turk", 4
        )
        questions.add(ques5)
        return questions
    }
}
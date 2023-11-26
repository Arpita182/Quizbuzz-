package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object CountryCons {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question>{
        val questions = mutableListOf<Question>()

        val ques1 = Question(
            1,"What country does this flag belong?",
            R.drawable.flagrussia, "India",
            "Germany","France",
            "Russia",
            4
        )
        questions.add(ques1)

        val ques2 = Question(
            2, "Which is the smallest country in the world? ",
            R.drawable.vc, "Sri Lanka","Bhutan",
            "Monaco","Vatican City", 4
        )
        questions.add(ques2)

        val ques3 =  Question(
            3, "What is the capital of Australia?",
            R.drawable.canberra, "Canberra","Austria",
            "Oslo", "Moscow",
            1
        )
        questions.add(ques3)

        val ques4 = Question(
            4, "Which country flag has symbol of Maple leaf?",
            R.drawable.canada, "Mexico","Canada", "Brazil",
            "United States",2
        )
        questions.add(ques4)

        val ques5 = Question(
            5, "Which is the smallest (in area) of the following Union Territories?",
            R.drawable.lk, " Chandigarh","  Dadra and Nagar Haveli", "Lakshadweep",
            "Daman and Diu",3
        )
        questions.add(ques5)

        return questions
    }
}
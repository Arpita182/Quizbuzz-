package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {

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
            2,"Which country does this monument belong to?",
            R.drawable.christ_the_redeemer_statue_rio_de_janeiro_brazil,
            "Rome,Italy", "New York,US",
            "Rio de Janeiro,Brazil", "Paris, France",
            3
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
            5, "Which state of India does this monument belong to? ",
            R.drawable.victoriamemorial, "Mumbai","Chhattisgarh",
            "Delhi","Kolkata", 4
        )
        questions.add(ques5)

        val ques6 = Question(
            6, "Commonwealth Games started from which country? ",
            R.drawable.cg, "England","Australia",
            "Canada","India", 3
        )
        questions.add(ques6)

        val ques7 = Question(
            7, "Which is the first Harry Potter book? ",
            R.drawable.hp, "HP and the Goblet of Fire","HP and the Philosopher’s Stone",
            "HP and the Chamber of Secrets","HP and the Half Blood Prince", 2
        )
        questions.add(ques7)

        val ques8 = Question(
            8, "Who was the author of the famous storybook 'Alice's Adventures in Wonderland'?",
            R.drawable.aiw, "Lewis Carroll","John Keats",
            "Rudyard Kipling","HG Wells", 1
        )
        questions.add(ques8)

        val ques9 = Question(
            9, "Which game first started in India? ",
            R.drawable.gms, "Cricket","Baseball",
            "Badminton","Chess", 4
        )
        questions.add(ques9)

        val ques10 = Question(
            10, "Which is the smallest country in the world? ",
            R.drawable.vc, "Sri Lanka","Bhutan",
            "Monaco","Vatican City", 4
        )
        questions.add(ques10)

        return questions
    }
}
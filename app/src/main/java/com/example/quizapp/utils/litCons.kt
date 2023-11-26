package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object litCons {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question>{
        val questions = mutableListOf<Question>()

        val ques1 = Question(
            1, "How many chapters are in Bhagavad Gita?",
            R.drawable.geeta, "10","12",
            "18","None of these", 3
        )
        questions.add(ques1)

        val ques2 = Question(
            2, "Which is the first Harry Potter book? ",
            R.drawable.hp, "HP and the Goblet of Fire","HP and the Philosopher’s Stone",
            "HP and the Chamber of Secrets","HP and the Half Blood Prince", 2
        )
        questions.add(ques2)

        val ques3 = Question(
            3, "Who was the author of the famous storybook 'Alice's Adventures in Wonderland'?",
            R.drawable.aiw, "Lewis Carroll","John Keats",
            "Rudyard Kipling","HG Wells", 1
        )
        questions.add(ques3)

        val ques4 = Question(
            4, "Which poet wrote the lines 'But I have promises to keep. And miles to go before I sleep.'?",
            R.drawable.rf, "William Shakespeare","Walt Whitman",
            "Robert Frost","Rabindranath Tagore", 3
        )
        questions.add(ques4)

        val ques5 = Question(
            5, "The fictional character 'Mowgli' is the creation of ",
            R.drawable.jb, "Ruskin Bond","PremChand",
            "R.K. Narayan","Rudyard Kipling", 4
        )
        questions.add(ques5)

        return questions
    }
}
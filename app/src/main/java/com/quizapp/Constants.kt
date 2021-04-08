package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "De que time é esse escudo?",
            R.drawable.river,
            "River Plate", "Náutico",
            "Monaco", "Atlético de Madrid", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "De que time é esse escudo?",
            R.drawable.partisan,
            "Bournemouth", "Bologna",
            "Partizan", "Montpellier", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "De que time é esse escudo?",
            R.drawable.leicester,
            "Hertha Berlin", "Saint Pauli",
            "Livorno", "Leicester City", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "De que time é esse escudo?",
            R.drawable.basel,
            "Lille", "Basel",
            "Brescia", "Dresden", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "De que time é esse escudo?",
            R.drawable.everton,
            "Brentford", "Fulham",
            "Everton", "Dusseldorf", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "De que time é esse escudo?",
            R.drawable.galatasaray,
            "Galatasaray ", "Besiktas",
            "Istanbulspor", "Fenerbahçe", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "De que time é esse escudo?",
            R.drawable.shaktar,
            "Albacete", "Espanyol",
            "Shaktar Donetsk", "Pachuca", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "De que time é esse escudo?",
            R.drawable.allaly,
            "Monterrey", "Aberdeen",
            "Eindhoven", "Al Ahly", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "De que time é esse escudo?",
            R.drawable.timbers,
            "Feyenoord", "Portland Timbers",
            "Napoli", "Parma", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "De que time é esse escudo?",
            R.drawable.sporting,
            "Sporting", "Benfica",
            "Nantes", "Rennes", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}
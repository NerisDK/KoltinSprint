package org.example.lesson_3

fun main() {

    var startPositionLetter: String = "E"
    var startPositionNumber: Int = 2
    var endPositionLetter: String = "E"
    var endPositionNumber: Int = 4
    var moveNumber: Int = 1

    var moveInfo: String =
        "Ход номер $moveNumber: Игрок сделал ход с $startPositionLetter$startPositionNumber на $endPositionLetter$endPositionNumber"
    println(moveInfo)

    startPositionLetter = "D"
    startPositionNumber = 2
    endPositionLetter = "D"
    endPositionNumber = startPositionNumber + 1
    moveNumber++

    moveInfo =
        "Ход номер $moveNumber: Игрок сделал ход с $startPositionLetter$startPositionNumber на $endPositionLetter$endPositionNumber"
    println(moveInfo)
}
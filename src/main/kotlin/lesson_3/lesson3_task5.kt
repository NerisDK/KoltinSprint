package org.example.lesson_3

fun main() {

    val inputMoveInfo: String = "D2-D4;0"

    val moveIntoArray: CharArray = inputMoveInfo.toCharArray()

    val startPositionLetter: Char = moveIntoArray[0]
    val startPositionNumber: Int = moveIntoArray[1].code - '0'.code
    val endPositionLetter: Char = moveIntoArray[3]
    val endPositionNumber: Int = moveIntoArray[4].code - '0'.code
    val moveNumber: Int = moveIntoArray[6].code - '0'.code

    println(startPositionLetter)
    println(startPositionNumber)
    println(endPositionLetter)
    println(endPositionNumber)
    println(moveNumber)
}
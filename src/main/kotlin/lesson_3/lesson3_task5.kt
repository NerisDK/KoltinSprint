package org.example.lesson_3

fun main() {

    val inputMoveInfo: String = "D2-D4;0"

    val moveIntoArray: List<String> = inputMoveInfo.split("-", ";")

    val startPosition: String = moveIntoArray[0]
    val endPosition: String = moveIntoArray[1]
    val moveNumber: Int = moveIntoArray[2].toInt()

    println(startPosition)
    println(endPosition)
    println(moveNumber)
}
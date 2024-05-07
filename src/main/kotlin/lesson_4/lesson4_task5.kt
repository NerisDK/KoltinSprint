package org.example.lesson_4

import kotlin.math.max

fun main() {

    val minPeople: Int = 55
    val maxPeople: Int = 70
    val minBoxCount: Int = 50

    print("Повреждения на судне (true/false): ")
    val shipIsDamaged = readLine()!!.toBoolean()
    print("Введите количество людей: ")
    val peopleCount: Int = readLine()!!.toInt()
    print("Введите количество коробок: ")
    val boxCount: Int = readLine()!!.toInt()
    print("Благоприятность погоды (true/false): ")
    val weatherIsGood: Boolean = readLine()!!.toBoolean()

    val mainAllowing: Boolean =
        (!shipIsDamaged && peopleCount in minPeople..maxPeople && boxCount >= minBoxCount && weatherIsGood)
    val alternativeAllowing: Boolean = (peopleCount == maxPeople && weatherIsGood && boxCount >= minBoxCount)

    if (mainAllowing || alternativeAllowing) {
        println("Судно готово к отплыву!")
    } else {
        println("Судно не готово к отплыву.")
    }

}
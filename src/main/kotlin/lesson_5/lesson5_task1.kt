package org.example.lesson_5

fun main() {

    val number1: Int = 10
    val number2: Int = 4

    print("$number1 + $number2 = ")
    val userValue: Int? = readLine()?.toInt()

    if (userValue == number1 + number2) {
        println("Введено верное значение!")
    } else {
        println("Введено неверное значение.")
    }
}
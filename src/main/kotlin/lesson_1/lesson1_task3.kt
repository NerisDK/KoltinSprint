package org.example.lesson_1

fun main() {

    val year: Short = 1961
    var hour: String = "09"
    var minute: String = "07"

    //Вывод даты и времени полета
    println("Год взлета: $year")
    println("Час взлета: $hour")
    println("Минута взлета: $minute")

    //Изменение данных переменных
    hour = "10"
    minute = "55"
    //Вывод времени посадки
    println("Время посадки: $hour:$minute")
}
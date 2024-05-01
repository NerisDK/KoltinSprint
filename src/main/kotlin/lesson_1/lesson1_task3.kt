package org.example.lesson_1

import java.util.Date

fun main() {

    val year: Short = 1961 //val, так как по задаче эта переменная статична. Есть ли тут смысл использовать Short?
    var hour: String = "09" //var
    var minute: String = "10" //var

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
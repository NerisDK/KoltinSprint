package org.example.lesson_1

fun main() {

    val secondsInSpace: Int = 6480
    val secondsInOneHour: Int = 3600
    val secondsInOneMinute: Int = 60

    //Вычисляем сколько часов в значении secondsInSpace, вычисляем остаток путем вычитания
    val hour: Int = secondsInSpace / secondsInOneHour
    var remainder: Int = secondsInSpace - (hour * secondsInOneHour)

    //Аналогично для минут
    val minute: Int = remainder / secondsInOneMinute
    remainder = remainder - (minute * secondsInOneMinute)

    //Вывод значений
    print("Время в космосе: ") //Print, чтобы не было переноса на новую строку
    print(String.format("[%02d:%02d:%02d]", hour, minute, remainder))
}
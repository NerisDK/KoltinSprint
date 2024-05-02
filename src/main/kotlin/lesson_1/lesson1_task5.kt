package org.example.lesson_1

fun main() {

    val secondsInSpace: Int = 6483 //Я добавил 3 секунды к значению из прошлой задачи
    var remainder: Int = secondsInSpace //Остаток от секунд. Var, так как будет меняться по ходу задачи

    //Вычисляем сколько часов в значении secondsInSpace, вычисляем остаток путем вычитания
    val hour: Int = secondsInSpace/3600
    remainder = secondsInSpace - (hour*3600)

    //Аналогично для минут
    val minute: Int = remainder/60
    remainder = remainder - (minute*60)

    //Вывод значений
    print("Время в космосе: ") //Print, чтобы не было переноса на новую строку
    print(String.format("[%02d:%02d:%02d]", hour, minute, remainder))
}
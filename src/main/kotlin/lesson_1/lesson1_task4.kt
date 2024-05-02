package org.example.lesson_1

fun main() {

    val length: Long = 40_868_600_000 //Long, так как значение слишком велико
    val age: Byte = 27 //27 находится в диапазоне чисел от -128 до 127
    val partOfDay: Float = 0.075F //Float способен вместить это значение. В конце числа пишем F.
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4 //Это число слишком велико для Float, поэтому используется Double
    val apogee: Int = 327000 //Что такое апогей? :В

    println("Расстояние: $length")
    println("Возраст: $age")
    println("Часть года: $partOfYear")
    println("Секунды в космосе: $seconds")
    println("Часть дня: $partOfDay")
    println("Апогей: $apogee")
}
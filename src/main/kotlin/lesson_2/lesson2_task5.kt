package org.example.lesson_2

fun main() {

    val amountOfMoney: Int = 70_000 //руб.
    val yearPercentage: Double = 16.7 //%
    val numberOfYears: Int = 20 //лет
    val defaultPercentage: Int = 100 //%
    val annualRate: Double = ((yearPercentage + defaultPercentage) / defaultPercentage)
    val result = amountOfMoney * Math.pow(annualRate, numberOfYears.toDouble())

    println("%.3f".format(result))
}
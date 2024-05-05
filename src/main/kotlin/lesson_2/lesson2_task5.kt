package org.example.lesson_2

fun main() {

    val amountOfMoney: Int = 70_000 //руб.
    val yearPercentage: Double = 16.7 //%
    val numberOfYears: Int = 20 //лет
    val defaultPercentage: Int = 100 //%
    var annualRate: Double = ((yearPercentage + defaultPercentage) / defaultPercentage).toDouble()
    var profitFromAnnualRate: Double = 0.0
    var result: Double = amountOfMoney.toDouble() //руб.


    for (i in 1..numberOfYears) {
        profitFromAnnualRate = (result * annualRate) - result
        result += profitFromAnnualRate
    }

    println("%.3f".format(result))
}
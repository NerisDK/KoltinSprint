package org.example.lesson_3

fun main() {

    val numberForCalculation: Int = 9
    val result: String = """
        $numberForCalculation x 1 = ${numberForCalculation * 1}
        $numberForCalculation x 2 = ${numberForCalculation * 2}
        $numberForCalculation x 3 = ${numberForCalculation * 3}
        $numberForCalculation x 4 = ${numberForCalculation * 4}
        $numberForCalculation x 5 = ${numberForCalculation * 5}
        $numberForCalculation x 6 = ${numberForCalculation * 6}
        $numberForCalculation x 7 = ${numberForCalculation * 7}
        $numberForCalculation x 8 = ${numberForCalculation * 8}
        $numberForCalculation x 9 = ${numberForCalculation * 9}
    """.trimIndent()

    println(result)
}
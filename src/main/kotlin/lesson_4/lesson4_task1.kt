package org.example.lesson_4

fun main() {

    val tableCount: Int = 13
    val reservedTablesForToday: Int = 13
    val reservedTablesForTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${if (reservedTablesForToday < tableCount) true else false }")
    println("Доступность столиков на завтра: ${if (reservedTablesForTomorrow < tableCount) true else false }")

}
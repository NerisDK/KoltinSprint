package org.example.lesson_4

fun main() {

    val tableCount: Int = 13 //постоянное количество столов
    val reservedTablesForToday: Int = 13
    val reservedTablesForTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${reservedTablesForToday < tableCount}")
    println("Доступность столиков на завтра: ${reservedTablesForTomorrow < tableCount}")

}
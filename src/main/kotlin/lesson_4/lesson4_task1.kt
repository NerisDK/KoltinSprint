package org.example.lesson_4

fun main() {

    val reservedTablesForToday: Int = 13
    val reservedTablesForTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${reservedTablesForToday < TABLE_COUNT}")
    println("Доступность столиков на завтра: ${reservedTablesForTomorrow < TABLE_COUNT}")

}

const val TABLE_COUNT = 13
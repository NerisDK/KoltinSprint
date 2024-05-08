package org.example.lesson_4

fun main() {

    //Первый день это день рук и пресса
    var armsAndPressDay: Boolean = true
    var legsAndBackDay: Boolean = false

    //Пятый день тренировок
    val currentWorkoutDay: Int = 3
    val isEvenDay: Boolean = currentWorkoutDay !in 1..currentWorkoutDay step 2

    if (isEvenDay) {
        armsAndPressDay = false
        legsAndBackDay = true
    }

    println("""
        Упражнения для рук: $armsAndPressDay
        Упражнения для ног: $legsAndBackDay
        Упражнения для спины: $legsAndBackDay
        Упражнения для пресса: $armsAndPressDay
    """.trimIndent())

}
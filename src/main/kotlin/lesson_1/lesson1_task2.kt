package org.example.lesson_1

fun main() {

    val orderCount: Int = 200
    val textOfGratitude : String = "Спасибо за покупку! Ваш заказ обрабатывается..."
    var employeeCount: Int = 200 //количество работников. Переменная var, так как она в будущем будет меняться.

    //вывод данных переменных
    println("$textOfGratitude\nКоличество заказов: $orderCount")

    //вывод количества работников
//    println("Количество работников: $employeeCount")

    //Один работник уволился. Вывод нового значения. Префиксная декрементация.
    println("Обновленное количество работников: ${--employeeCount}")

}
package org.example.lesson_3

fun main() {

    val userName: String = "Сэм"
    var currentTimeHelloMessage: String = "Добрый день"

    //Дневное приветствие
    println("$currentTimeHelloMessage, $userName")

    //Вечернее приветствие
    currentTimeHelloMessage = "Добрый вечер"
    println("$currentTimeHelloMessage, $userName")


}
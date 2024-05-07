package org.example.lesson_4

fun main() {
    val goodAirHumidity: Int = 20 //%

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20 //%
    val weatherSeason: String = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isAwningOpen && airHumidity >= goodAirHumidity && weatherSeason != "Winter"}")
}
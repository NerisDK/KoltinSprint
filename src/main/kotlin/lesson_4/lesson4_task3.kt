package org.example.lesson_4

fun main() {
    val goodAirHumidity: Int = 20 //%

    val sunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidity: Int = 20 //%
    val weatherSeason: String = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${if (sunnyWeather && openAwning && airHumidity >= goodAirHumidity && weatherSeason != "Winter") true else false}")
}
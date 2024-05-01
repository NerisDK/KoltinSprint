package org.example.lesson_1

fun main() {

    val secondsInSpace: Int = 6480;

    val minute: Int = secondsInSpace%3
    val hour: Int = secondsInSpace%360
    val remainder: Int = secondsInSpace%60

    println(hour)
    println(minute)
    println(remainder)

}
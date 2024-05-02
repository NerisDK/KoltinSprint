package org.example.lesson_2

fun main() {

    val hourOfStart: Int = 9
    val minuteOfStart: Int = 39
    val startTimeInMinutes: Int = (hourOfStart*60) + minuteOfStart
    val travelTimeInMinutes: Int = 457
    var endTimeInMinutes: Int = startTimeInMinutes + travelTimeInMinutes

    var hourOfEnd: Int = endTimeInMinutes/60
    endTimeInMinutes -= hourOfEnd*60
    val minuteOfEnd: Int = endTimeInMinutes

    print("Время приезда: ")
    println("[$hourOfEnd:$minuteOfEnd]")

}
package org.example.lesson_2

fun main() {

    val hourOfStart: Int = 9
    val minuteOfStart: Int = 39
    val minuteInOneHour: Int = 60 //min
    val travelTimeInMinutes: Int = 457
    val startTimeInMinutes: Int = (hourOfStart * minuteInOneHour) + minuteOfStart
    var endTimeInMinutes: Int = startTimeInMinutes + travelTimeInMinutes

    val hourOfEnd: Int = endTimeInMinutes / minuteInOneHour
    endTimeInMinutes -= hourOfEnd * minuteInOneHour
    val minuteOfEnd: Int = endTimeInMinutes

    print("Время приезда: [$hourOfEnd:$minuteOfEnd]")

}
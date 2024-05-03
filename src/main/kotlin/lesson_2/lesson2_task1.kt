package org.example.lesson_2

fun main() {

    val point1: Double = 3.0
    val point2: Double = 4.0
    val point3: Double = 3.0
    val point4: Double = 5.0
    val pointCount: Int = countOf(point1, point2, point3, point4)
    val averagePoint: Double = (point1 + point2 + point3 + point4) / pointCount

    println("Среднее арифметическое: $averagePoint")
}

fun countOf(vararg objects: Any): Int {
    var count: Int = 0
    for(obj in objects) {
        count++
    }
    return count
}
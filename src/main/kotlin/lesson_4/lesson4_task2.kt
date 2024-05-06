package org.example.lesson_4

fun main() {

    val minWeight: Int = 35 //кг
    val maxWeight: Int = 100 //кг
    val maxVolume: Int = 100 //литров

    var givenWeight: Int = 20 //кг
    var givenVolume: Int = 80 //литров
    println("Груз с весом $givenWeight кг и объемом $givenVolume литров соответствует категории 'Average': ${if (givenWeight <= maxWeight && givenWeight > minWeight && givenVolume < maxVolume) true else false}")

    givenWeight = 50 //кг
    givenVolume = 100 //литров
    println("Груз с весом $givenWeight кг и объемом $givenVolume литров соответствует категории 'Average': ${if (givenWeight <= maxWeight && givenWeight > minWeight && givenVolume < maxVolume) true else false}")

}
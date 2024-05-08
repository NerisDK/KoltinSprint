package org.example.lesson_4

fun main() {


    var givenWeight: Int = 20 //кг
    var givenVolume: Int = 80 //литров
    var isAverage: Boolean =
        givenWeight <= MAX_WEIGHT && givenWeight > MIN_WEIGHT && givenVolume <= MAX_VOLUME
    println(
        "Груз с весом $givenWeight кг и объемом $givenVolume литров соответствует категории 'Average': " +
                "$isAverage"
    )

    givenWeight = 50 //кг
    givenVolume = 100 //литров
    isAverage =
        givenWeight <= MAX_WEIGHT && givenWeight > MIN_WEIGHT && givenVolume <= MAX_VOLUME
    println(
        "Груз с весом $givenWeight кг и объемом $givenVolume литров соответствует категории 'Average': " +
                "$isAverage"
    )

}

const val MIN_WEIGHT: Int = 35 //кг
const val MAX_WEIGHT: Int = 100 //кг
const val MAX_VOLUME: Int = 100 //литров
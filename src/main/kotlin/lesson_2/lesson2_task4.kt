package org.example.lesson_2

fun main() {

    val crystals: Int = 7
    val iron: Int = 11
    val buffPercentage: Int = 20 //%
    val defaultPercentage: Int = 100 //%
    val converterToFraction: Double = 100.0
    val buffEffect: Double = (buffPercentage + defaultPercentage) / converterToFraction

    val buffedCrystals: Int = (crystals * buffEffect).toInt()
    val buffedIron: Int = (iron * buffEffect).toInt()

    val bonusCrystals: Int = buffedCrystals - crystals
    val bonusIron: Int = buffedIron - iron

    println("Добытая руда: ")
    println("кристаллы-$crystals шт.")
    println("железо-$iron шт.")
    println("Бонусы: ")
    println("кристаллы-$bonusCrystals шт.")
    println("железо-$bonusIron шт.")

}
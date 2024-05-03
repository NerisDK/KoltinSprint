package org.example.lesson_2

fun main() {

    val employeeCount: Int = 50
    val employeeSalary: Int = 30_000
    val internCount: Int = 30
    val internSalary: Int = 20_000

    val allWorkersCount: Int = employeeCount + internCount
    val companyExpensesForEmployees: Int = employeeCount * employeeSalary
    val companyExpenses: Int = companyExpensesForEmployees + (internCount * internSalary)
    val averageSalary: Int = companyExpenses / allWorkersCount

    println("Количество сотрудников: $employeeCount")
    println("Зарплата сотрудников: $employeeSalary")
    println("Количество стажеров: $internCount")
    println("Зарплата стажеров: $internSalary")
    println("Количество всех работников: $allWorkersCount")
    println("Средняя зарплата после прихода стажеров: $averageSalary")
    println("Расходы компании на выплату постоянным сотрудникам: $companyExpensesForEmployees")
    println("Расходы компании на выплату всем сотрудникам: $companyExpenses")


}
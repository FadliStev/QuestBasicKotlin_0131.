package com.example.pamnew


fun Contohlist(){
    println("=== List ===")
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape : MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    shape[0] = "Oval"
    println(shape)

    val shapesLocked : List<String> = shape
    println(shapesLocked)
}

fun main() {
    Contohlist()
}
package com.example.pamnew

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name: String){
    println()
    println("== With Parameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int){
    println()
    println("== with named Argument ==")
    println("Helo, $name!. You are $age Years old")
}

fun withDefaultParameter(name: String = "Indra", age: Int){
    println()
    println("== With Default Parameter")
    println("Hello, $name!. You are $age years old")

}

fun withReturn(panjang : Int, lebar : Int) : Int{
    return println(panjang * lebar)
}


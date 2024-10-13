package com.example.pamnew

fun uppercaseString(string: String): String{
    return string.uppercase()
}

fun main(){
    uppercaseString("hello")
    println({string:String -> string.uppercase()}("hello"))
}
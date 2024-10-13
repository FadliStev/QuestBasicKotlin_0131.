package com.example.pamnew

import org.jetbrains.annotations.NotNull

fun nullSafety(){
    var neverNull : String = "This Can't be null"

    var nullable: String? = "You can keep a null here"

    nullable = null

    if (neverNull == null){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)

    fun strLength(notNull: String):Int{
        return notNull.length
    }

    println(strLength(neverNull))


}

fun main(){
    nullSafety()
}
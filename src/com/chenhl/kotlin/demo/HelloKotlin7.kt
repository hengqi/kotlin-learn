package com.chenhl.kotlin.demo

/*
    when 关键字，类似于if else, else if, swith case
 */

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("hello world"))
    println(myPrint("test"))
    println(myPrint2("test"))

    println("-----")

    var a = 60
    var result = when (a) {
        1 -> {
            println("a is 1")
            10
        }
        2 -> {
            println("a is 2")
            20
        }
        3, 4, 5 -> {
            println("a is 3 or 4 or 5")
            30
        }
        in 6..10 -> {// in关键字表示a的值在6到10之间,包含6和10
            println("a is between 6 and 10")
            40
        }
        else -> {
            println("a is other value")
            50
        }
    }

    println("result=$result")
}

/*
    如果str是hello返回大写
 */
fun myPrint(str: String): String {
//    when (str) {
//        "hello" -> return "HELLO"
//        "world" -> return "WORLD"
//        "hello world" -> return "HELLO WORLD"
//        else -> return "other input"
//    }
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

//fun myPrint2(str: String): String =
fun myPrint2(str: String) =
        when (str) {
            "hello" -> "HELLO"
            "world" -> "WORLD"
            "hello world" -> "HELLO WORLD"
            else -> "other input"
        }
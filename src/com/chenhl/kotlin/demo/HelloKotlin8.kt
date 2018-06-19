package com.chenhl.kotlin.demo

fun main(args: Array<String>) {
    val a = 5;
    val b = 10;

    if (a in 2..b) {// in表示在一个范围内，以1为步进  .. 表示运算符重写,相当于rangTo
        println("a between 2 and 10")
    }

    if (a !in 2..b) {// 取反
        println("a not between 2 and 10")
    }

    println("---------")

    for (i in 2..10) {
        println(i)
    }

    println("---------")

    for (i in 2.rangeTo(10)) {
        println(i)
    }

    println("---------")

    for (i in 2..10 step 2) {// 表示以2为步进
        println(i)
    }

    println("---------")

    for (i in 10 downTo 2 step 4) {// 从高向低遍历 步进为4
        println(i)
    }

}
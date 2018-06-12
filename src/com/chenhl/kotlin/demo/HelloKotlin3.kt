package com.chenhl.kotlin.demo

/*
流程控制
 */

fun main(args: Array<String>) {

    var x = 10
    var y = 20

    // 1. 使用java的方式求出最大值最小值
//    var max: Int
//    var min: Int

//    if (x > y) {
//        max = x
//        min = y
//    } else {
//        max = y
//        min = x
//    }

//    println("max=$max, min=$min")

    // 2. 使用kotlin的方式来求最大值最小值
//    var max = if (x > y) x else y
//    var min = if (x < y) x else y
//    println("max=$max, min=$min")

    var max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min = if (x > y) {
        println("x > y")
        y
    } else {
        println("x <= y")
        x
    }

    println("max=$max, min=$min")


}
package com.chenhl.kotlin.demo

fun main(args: Array<String>) {
    // 定义一个数组
    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)
    // 也可以省略IntArray
//    var array2 = intArrayOf(1, 2, 3, 4, 5)


    // 数组的遍历
    // 下面两行代码是一样的
//    for (item: Int in array2) {
    for (item in array) {
        println(item)
    }

    println("=========")

    for (i: Int in array.indices) { // ======> 类似于Java中根据下标来遍历数组 for (int i=0;i<array.length;i++)
        println("array[$i]= ${array[i]}")
    }

    println("====同时遍历下标和值=====")

    for ((index, value) in array.withIndex()) {
        println("array[$index]=$value")
    }









}
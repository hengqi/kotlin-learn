package com.chenhl.kotlin.demo

import java.util.function.Consumer

fun main(args: Array<String>) {
//    println("hello world")

    val list: List<String> = listOf("hello", "world", "hello world")

    for (str in list) {
        println(str)
    }

    println("-------")

    list.forEach(Consumer { println(it) }) // it表示当前遍历的那个元素

    println("-------")

    list.forEach(System.out::println)
}
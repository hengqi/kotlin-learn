package com.chenhl.kotlin.demo

fun main(args: Array<String>) {
//    print(sum(1, 2))
//    print(sum2(2, 2))

//    myPrint(3, 4)
    myPrint2(3, 4)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b


// Unit表示这个函数不返回结果，相当于void
fun myPrint(a: Int, b: Int): Unit {
    println(a + b)
}

// 或者直接省略掉
fun myPrint2(a: Int, b: Int) {
    //使用字符串模板$来打印
    println("$a + $b = ${a + b}")
}


fun printMultiplicationTable() {
}
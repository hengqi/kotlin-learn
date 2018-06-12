package com.chenhl.kotlin.demo

/*

 */
fun main(args: Array<String>) {

//    println(convertStr2Int("23"))
//    println(convertStr2Int("ab"))

//    printMultiply("2", "3")
//    printMultiply("2", "a")

    printMultiply2("2", "3")
    printMultiply2("2", "a")
}

/**
 * Int? 此处的问号表示，可以返回一个Int类型，也可以返回一个null值，如果不加这个?表示必须返回一个Int值，不能返回一个null
 */
fun convertStr2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    var a2Int = convertStr2Int(a)
    var b2Int = convertStr2Int(b)

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    var a2Int = convertStr2Int(a)
    var b2Int = convertStr2Int(b)

    // 此时a2Int和b2Int的类型为Int?类型，所以必须判空
    if (null == a2Int) {
        println("param a not int")
    } else if (null == b2Int) {
        println("param b not int")
    } else {
        println(a2Int * b2Int)
    }
}
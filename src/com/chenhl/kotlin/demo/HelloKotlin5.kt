package com.chenhl.kotlin.demo

fun main(args: Array<String>) {
//    println(convert2UpperCase("hello world"))
    println(convert2UpperCase(23))
}

/*
 Any 类似于java中的object，代表任何类型
 */
fun convert2UpperCase(str: Any): String? {
    if (str is String) { // is 类似于 instanceof
        return str.toUpperCase() //此处与Java不同的是不需要再向下类型转换了，哈哈
    }
    return null
}
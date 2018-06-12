package com.chenhl.kotlin.demo

// 使用import来导入不同包内的类
//import com.chenhl.kotlin.demo2.multiply

// 使用import来导入不同包内的类，使用别名
import com.chenhl.kotlin.demo2.multiply as myMultipy

fun main(args: Array<String>) {
    // 使用val来定义一个常量，相当于final
    val a: Int = 1

    // 常量不能修改，但内容可以修改
    val m = intArrayOf(1, 2, 3)
//    m = intArrayOf(4, 5) 不可更改
    m.set(0, 4)

    for (item in m) {
        println(item)
    }

    // 也可以直接指定
    val b = 2 // 编译器会根据类型推断b是一个Int值

    // 使用var来定义一个变量
    var c: Int
    c=3
    c=4

    // 也可以不指定类型
    var d = 4

    // 在java中可以将小范围的数值型赋予大范围的，比如可以将byte类型的值赋予int类型
    // 但是在kotlin中不可以，可以使用下面的方法进行转换
    var x = 10
    var y: Byte = 20
//    x = y 不允许
    x = y.toInt()

    println(myMultipy(2, 3))
}
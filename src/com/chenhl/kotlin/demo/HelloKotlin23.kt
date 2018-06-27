package com.chenhl.kotlin.demo

// 扩展：extension

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b

    fun substract(a: Int, b: Int) = a - b
}

fun main(args: Array<String>) {
    var extensionTest = ExtensionTest()

    println(extensionTest.add(1, 2))
    println(extensionTest.substract(1, 2))

    println(extensionTest.multiply(1, 2))

    println("------")

    myPrint(AA())
    myPrint(BB())//调用是由对象的声明类型所决定的，而不是由对象的实际类型决定
}

// 扩展,表示multiply是ExtensionTest的一个扩展方法，好比该类已经拥有该方法了
// 扩展函数的解析是静态的
/*
    1. 扩展本身并不会真正的修改目标类，也就是说在目标类中插入新的属性或方法
    2. 扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的对象类型
    3. 调用是由对象的声明类型所决定的，而不是由对象的实际类型决定
 */
fun ExtensionTest.multiply(a: Int, b: Int) = a * b




open class AA

class BB: AA()

fun AA.a() = "a"

fun BB.a() = "b"

fun myPrint(aa: AA) {
    println(aa.a())
}
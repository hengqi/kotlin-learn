package com.chenhl.kotlin.demo
/*
    扩展属性
 */
class MyExtensionProperty

val MyExtensionProperty.name: String
    get() = "hello"

fun main(args: Array<String>) {
    var myExtensionProperty = MyExtensionProperty()
    println(myExtensionProperty.name)
}
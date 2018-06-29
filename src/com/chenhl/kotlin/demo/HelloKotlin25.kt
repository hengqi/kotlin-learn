package com.chenhl.kotlin.demo

/*
    伴生对象扩展
 */

class CompanionObjectExtension {
    companion object MyObject {

    }
}

fun CompanionObjectExtension.MyObject.method() {
    println("hello world")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.method()
}
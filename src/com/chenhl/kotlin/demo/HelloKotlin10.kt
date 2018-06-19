package com.chenhl.kotlin.demo

fun main(args: Array<String>) {
    var a: String = "hello \\n world"
    println(a)

    // """ """ 三对双引号之间的内容会原样输出
    var b: String = """hello
        \n world
        \n welcome
    """
    println(b)
}
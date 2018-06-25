package com.chenhl.kotlin.demo

/*
kotlin中的接口
 */

interface A {
    // 跟java8的default方法一致，只不过前面不需要加上default关键字
    fun method() {
        println("A")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

// 实现A接口，继承B
class C : A, B() {
    // 方法的重写
//    override fun method() {
//        super.method()
//    }

    override fun method() {
        super<A>.method()// 调用A中的method
        super<B>.method()// 调用B中的method
        println("C")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}
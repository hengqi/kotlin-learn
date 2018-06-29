package com.chenhl.kotlin.demo

/*
    扩展的作用域
    1. 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
    2. 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receiver）
    3. 当以上两个名字出现冲突时，扩展接收者优先级最高
 */

//扩展接收者
class DD {
    fun method() {
        println("DD method")
    }
}

//分发接收者
class EE {
    fun method2() {

    }

    fun DD.hello() {
        // 对DD的扩展，所以可以使用DD里已经拥有的方法，
        // 也可以调用method2
        method()
        method2()
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        //当以上两个名字出现冲突时，扩展接收者优先级最高
        // 1.当调用toString时，使用的时DD里的toString
        println(toString())
        // 2.如果想调用EE里的toString()
        println(this@EE.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main(args: Array<String>) {
    EE().test()
}

// 关于扩展的总结
// 扩展可以很好的解决Java中充斥的各种辅助类的问题
// Collections.swap(list, 4, 10)
// list.swap(4, 10)
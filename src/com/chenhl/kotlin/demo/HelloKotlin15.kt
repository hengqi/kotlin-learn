package com.chenhl.kotlin.demo

/*
Kotlin中方法的重写
 */

open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun expirationDate() {
        println("1 month")
    }
}

class Apple : Fruit() {
    override fun name() {
        println("apple")
    }
}

open class Orange : Fruit() {
    // 虽然Orange这个类使用open关键字来表明该类是可以被继承的，但是name这个方法已经使用了final来修饰表明子类不能重写该方法
    final override fun name() {
        println("orange")
    }
}


fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.expirationDate()
}
package com.chenhl.kotlin.demo

// 属性的重写

open class MyParent {
    open var name: String = "parent"
}

class MyChild : MyParent() {
    override var name: String = "child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)

    println("-----")

    var myChild3 = MyChild3()
    myChild3.method()
    println(myChild3.name)
}

// 通过primary constructor来复写父类中的属性
class MyChild2(override var name: String) : MyParent() {

}


// val类型的属性可以被val和var类型的属性override
// var类型的属性只能被var类型的属性override

// 本质上，val相当于get方法，而var相当于get、set方法
open class MyParent3 {
    open fun method() {
        println("parent method")
    }

    open val name: String get() = "parent"
}

class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }

    override val name: String
        get() = super.name + " and child"
}
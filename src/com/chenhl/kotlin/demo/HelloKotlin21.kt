package com.chenhl.kotlin.demo

/*
    延迟初始化 属性
    kotlin要求非空类型的属性必须要在构造方法中进行初始化
    有时，这种要求不太方便，比如我们可以通过依赖注入或是单元测试情况下进行属性的赋值
    通过lateinit关键字标识为延迟初始化，需要满足如下三个条件
    1.lateinit只能用在类体中声明的var属性上，不能用在primary constructor声明的属性上
    2.属性不能拥有自定义的set/get
    3.属性类型需要为非空，且不能是原生数据类型

    也就是说，
    一个属性如果被lateinit修饰的时候，那么kotlin就不会检查在这个类创建对象的时候，该属性是否有初始值，默认情况下，必须要有初始值

 */

class TheClass {
    lateinit var name: String

    fun init() {
        this.name = "zhangsan"
    }

    fun print() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    var theClass = TheClass()

    theClass.init() // 虽然是延迟初始化，就是必须要在使用之前初始化才能用
    theClass.print()
}
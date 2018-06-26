package com.chenhl.kotlin.demo

/*
kotlin中属性的基本使用
属性的完整的表示形式
    var propertyName: propertyType = initializer
        get() ...
        set() ...
    其中，propertyType, initializer,set(),get()都可以省略
    get方法的可见性要和属性的可见性保持一致

关于backing feild, 支撑字段，
backing property , 支撑属性

 */
class ThePerson(address: String, name: String) {
    // 只读属性的特点：①使用val来声明，②只有get方法，没有set方法
//    val age : Int = 20

    // 表示定义一个常量 age, Int类型可省略
//    val age: Int
    val age
        get() = 20

    var address: String = address
        get() {
            println("get invoked")
            return field
        }
        set(value) {
            println("set invoked")
            field = value
        }

    var name: String = name
}

fun main(args: Array<String>) {
    var person = ThePerson("shanghai", "zhangsan")
//    println(person.age)// 实际上调用的是age的get方法

    println(person.address)
    person.address = "tianjin"
    println(person.address)

    println("------")
// 没有提供get/set的话，默认会提供get/set方法
    println(person.name)
    person.name = "lisi"
    println(person.name)
}
package com.chenhl.kotlin.demo

class Person constructor(username: String) {

    private var username: String
    private var age: Int
    private var address: String

    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    //secondary构造方法，定义在类体内
    // 1.一个secondary构造方法必须要直接或间接的调用primary构造方法
    constructor(username: String, age: Int) : this(username) {
        println(username + ", "+ age)
        this.username = username
        this.age = age
        this.address = "beijing"
    }


    constructor(username: String, age: Int, address: String) : this(username, age){
        this.address = address
    }

    fun printInfo() {
        println("username: ${this.username}, age: ${this.age}, address: ${this.address}")
    }
}

fun main(args: Array<String>) {
    val person = Person("zhangsan")
    val person2 = Person("lisi", 30)
    val person3 = Person("wangwu", 40, "hangzhou")

    person.printInfo()
    person2.printInfo()
    person3.printInfo()
}
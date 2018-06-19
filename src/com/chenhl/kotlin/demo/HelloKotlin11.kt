package com.chenhl.kotlin.demo

// 一个类如果没有任何内容，花括号是可以省略的
// 在Kotlin中默认是public的所以public可以省略
//public class EmptyClass {
//}
 class EmptyClass

// 在kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
// constructor(username: String)是primary构造方法，是类头的一部分，它位于类名后面，可以拥有若干个参数
class MyClass constructor(username: String) {

// 如果primary构造方法没有任何注解或是可见性关键字修饰，那么constructor关键字可以省略
//class MyClass (username: String) {


    init{// 初始化代码块，类似Java中的构造方法代码块，主要用于给类或对象的属性赋予初始值的，
        //这里可以直接使用构造方法的参数
        println(username)
    }

    private val username: String = username.toUpperCase()
}

fun main(args: Array<String>) {
    // 生成实例，与Java相比，省略了new这个关键字
    var myClass = MyClass("zhangsan")
}

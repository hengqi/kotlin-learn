package com.chenhl.kotlin.demo

// 可以将成员变量直接定义在这里
class Student(private val username: String, private val age: Int, private var address: String) {

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

// 如果构造方法拥有可见性修饰符，或注解，那么constructor关键字不可省略， 且位于其后
class Student2 private constructor(username: String) {

}

// 默认值的设定
// 在JVM上，对于primary构造方法，如果所有参数都拥有默认值，那么编译器还会生成一个不带参数的构造方法，
// 这个构造方法会使用这些参数默认值，这样做的目的在于用于可以跟spring等框架更好的集成
class Student3(val username: String = "zhangsan") {

}


fun main(args: Array<String>) {
    val student = Student("zhangsan", 20, "shenzhen")

    student.printInfo()
}

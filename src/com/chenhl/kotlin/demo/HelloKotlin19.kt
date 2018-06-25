package com.chenhl.kotlin.demo

// object declaration 对象声明

object MyObject {
    fun method() {
        println("method")
    }
}

fun main(args: Array<String>) {
    MyObject.method()

    println("-----")

    MyTest.MyObject.method()

    println("-----")

    println(MyTest.a)
    MyTest.method()// 类似于Java中的静态方法，Kotlin中没有静态方法

    println("-----")

    println(MyTest.MyObject.javaClass)//com.chenhl.kotlin.demo.MyTest$MyObject

    println("-----")
    D.foo()
    D.bar()//实际上是通过伴生对象来传递的D.bar -> D.companion.bar()

}

// 伴生对象 companion object
// 在kotlin中，与Java不同的是，类是没有static方法的
// 在大多数情况下，kotlin推荐的做法是使用包级别的函数来作为静态方法
// Kotlin会将包级别的函数当作静态方法来看待


// 注意：虽然伴生对象的成员看起来像Java中的静态成员，但在运行期，他们依旧是真实对象的实例成员
// 在JVM上，可以将伴生对象的成员真正的生成为类的静态方法与属性，这是通过@JvmStatic注解来实现的
// 伴生对象在编译后会生成一个静态内部类
class MyTest {
    companion object MyObject {
//    companion object  { // 伴生对象的名字可以省略，如果不提供，Kotlin编译器会提供一个默认的名称Companion
        var a: Int = 100

//        @JvmStatic//在JVM上，可以将伴生对象的成员真正的生成为类的静态方法与属性，这是通过@JvmStatic注解来实现的
        fun method() {
            println("method invoked!")
        }
    }

    // 在Kotlin中只能存在一个伴生对象
//    companion object MyObject2 {

//    }
}

// 使用Javap 反编译之后，会发现foo会成为D的静态方法，bar还是一个实例方法
class D {

    companion object {
        @JvmStatic
        fun foo() {

        }

        fun bar() {

        }
    }
}


package com.chenhl.kotlin.demo

// 可见性 visibility  类似于Java中的访问控制符 public default protected private

// Kotlin提供的4种可见性修饰符：private protected internal public

//Kotlin中，如果不写的话，默认是public，Kotlin中没有default级别，Java中是default
//如果加上private的话，只能在该文件中能使用，
//如果加上internal，表示只能在同一个模块下使用
//如果加上protected，表示

// 直接在包下面的声明，称为顶层声明
fun method() {
//private fun method() {
//internal fun method() {
//protected fun method() {//不能用在顶层声明的函数，类修饰

}

open class Clazz {
    private val b = 3
    protected open val c = 4
    internal val d = 5
}

class subClazz : Clazz() {
    // c, d能用， b不能用

}



class Clazz2 {

    //如果一个成员是private,表示只能在当前类中使用
    //如果一个成员是protected,表示只能在当前类和子类中使用
    //如果一个成员是internal,表示在该模块中，也就是说只要能访问到这个类，就能使用
    //public的话，任何地方都能使用

    // 局部变量没有访问修饰符
}
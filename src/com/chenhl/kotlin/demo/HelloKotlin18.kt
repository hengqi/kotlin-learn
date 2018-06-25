package com.chenhl.kotlin.demo

/*
kotlin中的抽象类
 */

open class BaseClass {
    open fun method() {

    }
}

abstract class ChildClass : BaseClass() {
    override abstract fun method()
}
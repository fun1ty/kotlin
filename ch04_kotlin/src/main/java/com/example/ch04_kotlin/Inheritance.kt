package com.example.ch04_kotlin

fun main(){

    val sub2 = Sub2()
    sub2.superData =20
    sub2.superFun()


    //3.오버라이딩
    val sub3 = Super3.Sub3()
    sub3.superFun()
    val super3 = Super3()
    super3.superFun()
}

//---1.상속과 생성자
open class Super{ }
class Sub : Super(){ }

open class Super1(name: String) { }
class Sub1(name: String): Super1(name){ }
class sub11 : Super1{
    constructor(name: String): super(name)
}

open class oo{}
class Pub : oo(){ }

open class oo1(num : Int){ }
class Pub1(num:Int): oo1(num){ }
class pub11: oo1{
    constructor(num:Int) : super(num)
}

//---2.상속
open class Super2{  //원본소스를 고치지 말고 상속 받아서 수정해야함
    var superData = 10
    fun superFun() {
        println("superFun: $superData")
    }
}

class Sub2: Super2() { }  //{ } 생략가능

//---3.오버라이딩 : 부모가 가진 메소드를 재정의
open class Super3{
    open var superData = 10
    open fun superFun() {
        println("superFun: $superData")
    }
    class Sub3: Super3(){
        override var superData =20
        override fun superFun() {
            println("superFun: $superData")
        }
    }
}



package com.example.ch03_kotlin

//---1. 변수, 상수---
val data1: Int =10
var data2 = 20


fun main(){
    //data1 = 20
    data2 = 20

    // 2. 초기화 함수 호출
    someFun2()

    //3. 초기화 미루기
    data33="ABCD"
    //println(data33.length) //문자의 길이
    //val data4 = data33.length
    println(data4+10)

    println(data4)

    //----4. 데이터 타입
    someFun4()

    //1~10까지 합
    println(data5)

    //5. 함수
    println(some(10))
    println(some(10,20))
    println(some(data2=10, data1=20))
}

//----2. 초기화------
//var data21: Int   //초기화 오류 발생(top level에서 초기화 해주지 않음)
var data22 = 10
fun someFun2(){
    val data3 : Int
   // println("data3 : $data3")  //초기화 오류
    data3 =10
    println("data3 : $data3")
    lateinit var data33 : String
}

class User{
    // val data4 : Int 초기화 오류
    var data5:Int =10
}

//---3. 초기화 미루기 ----

//lateinit var data31 : Int //오류(Int) :기본형
 //lateinit val data32 : String //오류 발생 (val)
lateinit var data33 : String

val data4 : Int by lazy{
    println("in lazy")
    //10
    println("in lazy ${data33.length}")
    data33.length
}

val data5 : Int by lazy{
    var hap = 0
    for (i in 1..10){
        hap+=i
    }
    hap

}

//----4. 데이터 타입
fun someFun4(){
    var data1: Int =10
    var data2: Int ?= null

    data1 += 10
    data1 = data1.plus(10)
    ++data1

    println(data1)

    val str1 ="Hello \n World!!"
    val str2 = """
        Hello
        World!!
       """.trimIndent()
    println(str1)
    println(str2)

    fun sum(no: Int): Int{
        var sum = 0
        for (i in 1..no){
            sum += i
        }
        return sum
    }
    val name : String ="kkang"
    println("name: $name, sum: ${sum(10)}, 연산: ${10+20}")

}

//---5.함수
fun some(data1 : Int, data2 : Int =10) : Int{
    return data1 *data2

}
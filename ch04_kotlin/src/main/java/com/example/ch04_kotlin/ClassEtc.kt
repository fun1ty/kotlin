package com.example.ch04_kotlin

fun main(){
    //--- 1. Data Class
    var gen1 = GenClass("kkang", "email", 20)
    var gen2 = GenClass("kkang", "email", 20)

    var data1 = DataClass("kkang", "email", 20)
    var data2 = DataClass("kkang", "email", 20)

    println(gen1.equals(gen2))
    println(data1.equals(data2))

    //---2. 주 생성자의 맴버변수만 비교
    var data21 = DataClass2("kkang", "email", 20, "seoul")
    var data22 = DataClass2("kkang", "email", 20,"busan")
    println(data21.equals(data22))

    //3. toString
    println(gen1.toString())  //일반 class는 메모리 주소값이 출력
    println(data1.toString()) //data class는 내부 데이터 출력

    //4. 오브젝트 클래스(익명클래스 -> 객체)
    val obj4 = object : Super3(){
        override var superData= 20
        override fun superFun() {
            println("subFun : $superData")
        }
    }

    obj4.superData =30
    obj4.superFun()

    //---5. 컴패니언 오브젝트 클래스
    MyClass.Companion.data =30
    MyClass.Companion.some()

    MyClass.data =50
    MyClass.some()

}

//--- 1. Data Class
class GenClass(val name:String, val email: String, val  age: Int) //일반 클래스는 메모리 주소값으로 비교
data class DataClass(val name:String, val email: String, val  age: Int)

//---2. 주 생성자의 맴버변수만 비교
data class DataClass2(val name:String, val email: String, val  age: Int){
    lateinit var address:String  //나중에 데이터 받아서 초기화
    constructor( name:String,  email: String,  age: Int, address:String ):
            this(name, email, age){
                this.address = address
            }
}

//---5. 컴패니언 오브젝트 클래스
class MyClass{
    companion object {
        var data = 10
        fun some(){
            println(data)
        }
    }
}
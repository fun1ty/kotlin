package com.example.ch04_kotlin

fun main(){
    //1.class
    val user = User("kim")
    user.someFun()

    //2. 주 생성자 초기화
    val user2 = User2("kim", 10)

    user2.someFun()

    //4.보조 생성자
    val user4 = User4("kim")
    val user41 = User4("kim", 10)

    //5. 주,보조 생성자 연동
    val user5 = User5("kim")
    val user51 = User5("kim",10)
    val user52 = User5("kim",10, "123@gmail.com")
}

//---1. class
class User{
    var name = "kkang"
    constructor(name: String) {
         this.name = name
    }

    fun someFun(){
        println("name: $name")
    }

    class somClass{}
}

//--- 2. 주 생성자 초기화
class User2(name: String, count : Int){
    var pName :String =""
    var pCount : Int =0

    init {
        println("name: $name, count : $count")
        this.pName = name
        this.pCount = count
    }
    fun someFun(){
        println("name: ${pName}, count : ${pCount}")
    }
}

//--- 2. 주 생성자 초기화
class User3(val name: String, var count : Int){
    fun someFun(){
        println("name: $name, count : $count")
    }
}

//----4. 보조생성자
class User4{
    constructor(name: String){
        println("name: $name")
    }

    constructor(name: String, count: Int){
        println("name: $name, count : $count")
    }
}

//---5. 주, 보조 생성자 연동
class User5(name: String) {
    init{
        println("1.name: $name")
    }

    constructor(name: String, count: Int): this(name){
        println("2.name: $name, count : $count")
    }

    constructor(name: String, count: Int, email: String): this(name, count){
        println("3.name: $name, count : $count, email : $email")
    }
}
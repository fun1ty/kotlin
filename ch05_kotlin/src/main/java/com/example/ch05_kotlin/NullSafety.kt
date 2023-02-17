package com.example.ch05_kotlin

fun main(){
    //--1. null처리
    var data :String? = null
    var length = if (data == null){
        0
    }else{
        data.length
    }
    println("data length: $length")

    //2. ?. ?:
    println("data length: ${data?.length ?: 0}")

    data = "kkang"
    println("data length: ${data?.length ?: 0}")

    some("kkang")
    some(null)
}

//---4.예외 !! 연산자
fun some(data: String?) : Int{
    return data!!.length  //정식함수는 return을 써야한다.
}
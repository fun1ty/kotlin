package com.example.ch03_kotlin

fun main(){
    ifEx()

    //2.whenEx()
    whenEx()

    //3. loop
    loopEx()
}

//----1. if
fun ifEx(){
    var data = 10
    if (data > 0) {
        println("data > 0")
    } else{
        println("data <= 0")
    }

    data =20
    if (data > 10){
        println("data > 10")
    }
    else if (data in 11..20){
        println("data <= 20")
    }else{
        println("data < 10")
    }

    var result = if(data >=20){
        println("data >= 20")
        true
    } else {
        println("data < 20")
        false
    }


    var 손영석 :Int =0
    var betresult = if(손영석 >=60){
        println("손영석 >= 60")
        true
    } else {
        false
    }
    손영석 =59
    println(betresult)

    var punishment = if(betresult == false){
        println("처벌 : 무간지옥")
    } else{

    }
}


//----2.when
fun whenEx(){
    var data =10

    when(data){
        10 -> println("data = 10")
        20 -> println("data = 20")
        else -> {
            println("data is ?")
        }
    }


    var 손영석_점수 :Any =0

    when(손영석_점수){
        in 0..59 -> println("처벌 : 무간지옥")
        else -> {
            println("")
        }
    }

    var data2 =10
    val result = when{
        data2 <=0 -> "data1 <=0"
        data2 > 0 -> "data2 > 0"
        else -> {
            "data is ?"
        }
    }

    println(result)
}


//---3.loop
fun loopEx(){
    var sum : Int =0
    for (i in 1..10){
        sum += i
    }
    println(sum)

    var datas = arrayOf(10,20,30)
    for (data in datas){
        print("$data, ")
    }
    println()

    for (i in datas.indices){
        print("${datas[i]}, ")
    }
    println()

    for ((i,v) in datas.withIndex()){
        print(v)
        if(i !=datas.size-1) print(", ")
    }
    println()

    var x = 0
    var sum1 = 0

    while (x<11) {
        sum1 += x
        x+=1

    }
    println(sum1)
}


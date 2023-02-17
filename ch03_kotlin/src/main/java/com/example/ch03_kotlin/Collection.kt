package com.example.ch03_kotlin

fun main(){
    //-----1. 배열 타입
    arrayEx()
    listEx()
    mapEx()
}

//-----1. 배열 타입
fun arrayEx(){
    //var data1: Array<Int> = Array(3,{ x -> 0 })
    //var data1: Array<Int> = Array(3,{ x -> 0 })
    //var data1: Array<Int> = Array(3) { x -> 0 }
    var data1: Array<Int> = Array(3) { 0 }

    data1.forEach { x -> println(x) }

    data1[0] =10
    data1[1] = 20
    data1.set(2, 30)  //data1[2] --> 인덱스를 사용하는 것을 권장

    data1.forEach { x -> println(x) }

    println("""
        array size : ${data1.size}
        array data: ${data1[0]},${data1[1]},${data1[2]}
        """.trimIndent()
        )

    var data2 = arrayOf<Int>(1,2,3)

    data2.forEach { x -> println(x) }

    println("""
        array size : ${data2.size}
        array datat: ${data2[0]}, ${data2[1]}, ${data2[2]}
        """.trimIndent()
        )
}

//-----2. 리스트 타입

fun listEx(){
    var list = listOf<Int>(10,20,30)
    println("""
        list size: ${list.size}
        list date: ${list[0]}, ${list[1]}, ${list[2]}
        """.trimIndent())

    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3, 40)
    mutableList.set(0,50)
    println("""
        list size: ${mutableList.size}
        list date: ${mutableList[0]}, ${mutableList[1]}, ${mutableList[2]}
        """.trimIndent())
}

//---3. map타입

fun mapEx(){
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world" ,"three" to "three1")
    println("""
        list size: ${map.size}
        list date: ${map.get("one")}, ${map.get("two")} , ${map.get("three")}
        """.trimIndent())

    var mutableMap = mutableMapOf<String, String>()
    mutableMap.put("one", "차")
    mutableMap.put("two", "은")
    mutableMap.put("three", "우")
    mutableMap.put("four", "?")
    mutableMap["four"] = "I lov U"
    println("""
        list size: ${mutableMap.size}
        list date: ${mutableMap["one"]}, ${mutableMap["two"]}, ${mutableMap["three"]}, ${mutableMap["four"]}
        """.trimIndent())

}
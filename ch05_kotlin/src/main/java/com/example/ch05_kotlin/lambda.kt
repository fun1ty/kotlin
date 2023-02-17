package com.example.ch05_kotlin

fun main(){
    //1.기본
    val sum = {no1: Int, no2: Int -> no1 * no2 }
    println(sum(1, 2))
    println({no1: Int, no2: Int -> no1 * no2 } (1, 2))

    // 2. 매개변수 없는 람다식
    //val fn2 = { -> println("function call") }
    val fn2 = { println("function call") }
    fn2()

    //3. 매개변수가 1개
    val fn3 = { no:Int -> println(no) }
    val fn31 : (Int) -> Unit ={ println(it) }
    fn31(10)

    //4.반환값
    val fn4 = { no1:Int, no2:Int -> no1+no2}
    println(fn4(1,2))

    //5. 함수타입
    val fn5 :(Int, Int ) -> Boolean = {no1, no2 -> no1 > no2}
    val fn51 :MyFunctionType = {no1, no2 -> no1 > no2}

    //6. 고차함수
    //var result = hofFun ({ no -> no > 10 })
    //var result = hofFun (){ no -> no > 10 }
    var result = hofFun { no -> no > 10 }
    println(result())

    //7. 인터페이스
    val button = Button()
    button.onClick("버튼이 클릭")

    val button1 = object : Clickable { //무명클래스를 만들어서 객체생성하여 button1에 넣는다.
        override fun onClick(msg: String) {
            println("${msg} 를 출력합니다.")
        }

    }
    button1.onClick("버튼1이 클릭")

    //함수형 인터페이스
    val button2 = Clickable1 { msg -> println("${msg} 를 출력합니다.") }
    button2.onClick("버튼2이 클릭")

    Clickable1 { msg -> println("${msg} 를 출력합니다.") }.onClick("버튼3이 클릭")
}


//----5.함수타입
typealias MyFunctionType = (Int, Int ) -> Boolean

//---6. 고차함수
fun hofFun(arg: (Int) -> Boolean) :() -> String {
    val result = if(arg(10)){
        "valid"
    } else{
        "invalid"
    }
    return {"hofFun result : $result"}
}

//---7. 인터페이스
interface Clickable {
    fun onClick(msg: String)
}

class Button : Clickable{
    override fun onClick(msg: String) {
        println("${msg} 를 출력합니다.")
    }

}

fun interface Clickable1 {
    fun onClick(msg: String)
}
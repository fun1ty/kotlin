package com.example.ch05_kotlin

/** 스코프 함수
 *  * -apply, run, with, also, let
 */

class Coffee(var name:String, var price: Int){
    fun event(){
        price -=1000

    }
}

class Book(var name:String, var price : Int){
    fun discount(){
        price -=2000
    }
}

fun main(){
    //1.apply  코드의 실행 순서를 순차적으로 지정하게 한다.
    //클래스 객체 생성 후 반환
    // this: 객체
    /*var coffee = Coffee("아메리카노", 1500).apply {
        this.name = "이벤트: $name"
        this.event()
    }*/

    var bookDiscout = Book("해로의 모험", 10000).apply {
        name="[폭탄 세일중]"+name
        discount()
    }
    println("상품명 : ${bookDiscout.name}, 가격: ${bookDiscout.price}")

    var bookcost = bookDiscout.run{  //이미 있는 인스턴스를 재활용  or 그를 이용한 특정계산의 결과가 필요한 경우
        println("상품명 : ${name}, 가격 : ${price}")
        price+2000
    }
    println("run: 원가는 $bookcost 입니다.")

    var bookcost1 = with(bookDiscout){
        println("상품명 : ${name}, 가격 : ${price}")
        price+2000
    }
    println("with: 원가는 $bookcost 입니다.")

    //----- coffee 예제-----
    var coffee = Coffee("아메리카노", 1500)

    coffee.apply {
        this.name = "이벤트 : $name"
    }.apply {
        this.event()
    }

    println("1.apply: ${coffee.name}, ${coffee.price}원")

    //2. run 맴버필드를 반환
    // this : 객체
    var price1 = Coffee("카푸치노", 1500).run {
        println("2. run: ${this.name}, ${this.price}원")
        this.event()

        this.price-1000 //--> return


    }
    println("2. run: 카푸치노, ${price1}원")  //run은 맴버필드만 신경쓴다.

    //3. with
    // this : 객체, 반환이 없음
    with(coffee) {
    println("3.with: ${this.name}, ${this.price},${name}, ${price}원")
    }

    //4.also
    //매개변수를 이용해서 객체를 전달 it. 반환값이 없음
    coffee.also {  }


}

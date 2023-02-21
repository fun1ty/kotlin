package com.example.ch06_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.activity_ex05)
        //activity_ex06
        /*
        var binding = ActivityEx06Binding.inflate(layoutInflater)  //바인딩 객체 생성 , layoutInflater 정적변수 = static(이미 만들어진것을 제공, 보라색 폰트), this도 사용가능하나 생략됨
        setContentView(binding.root)
        binding.visibleBtn.setOnClickListener{    //이벤트 핸들러, 자기자신을 지칭할 때 --> it (=this)
            binding.targetView.visibility = View.VISIBLE
        }

        binding.invisibleBtn.setOnClickListener{
            binding.targetView.visibility = View.INVISIBLE
        }*/

    }
}
package com.example.ch09_resource

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ch09_resource.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)

        var binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.textView.text = getString(R.string.txt_data2)

        //binding.textView2.text = resources.getString(R.string.txt_data2)

        //binding.textView2.textSize = resources.getDimension(R.dimen.txt_size)  //resources를 사용하는 것을 권장
        //binding.textView2.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_color, null))
        //호환성 관련 문제로 setTextColor 객체를 사용한다.
        // resources 내부적으로 만들어진 static(context에서 관리한다)
        //setContentView(R.layout.activity_main2)
    }
}
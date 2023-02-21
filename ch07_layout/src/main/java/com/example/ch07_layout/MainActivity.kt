package com.example.ch07_layout

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang","Touch Event : down")
                Log.d("kkang", "Touch Event: x: ${event.x}, rawX: ${event.rawX}")  //위치값 출력 : rawX
            }

            MotionEvent.ACTION_UP -> {
                Log.d("kkang","Touch Event : up")
            }
        }
        return super.onTouchEvent(event)
    }
}
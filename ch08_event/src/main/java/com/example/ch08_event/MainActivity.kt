package com.example.ch08_event

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //setContentView 사용할 때마다 초기화가 된다.
        /*
        onBackPressedDispatcher?.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Log.d("kkang","Back Button을 눌렀어요.")
            }
        })

        var binding = ActivityEx01Binding.inflate(layoutInflater)
        setContentView(binding.root) //setContentView 사용할 때마다 초기화가 된다.(겹쳐써도 상관 없음)
        binding.checkbox.setOnCheckedChangeListener {
            CompoundButton, b ->
                Log.d("kkang","checkbox을 눌렀어요.")
        }

        binding.button.setOnClickListener {
            Log.d("kkang", "클릭이벤트")
        }

        binding.button.setOnLongClickListener { //인터페이스의 추상메서드를 구현
            Log.d("kkang", "롱클릭이벤트")
            true
        }*/
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

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("kkang", "onkeyDown")
        when(keyCode){
            KeyEvent.KEYCODE_0 -> Log.d("kkang", "0키를 눌렀네요")
            KeyEvent.KEYCODE_A -> Log.d("kkang", "A키를 눌렀네요")

            KeyEvent.KEYCODE_BACK -> Log.d("kkang", "BACK키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("kkang", "VOLUME_DOWN키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("kkang", "VOLUME_UP키를 눌렀네요")
        }
        return super.onKeyDown(keyCode, event)
    }
}
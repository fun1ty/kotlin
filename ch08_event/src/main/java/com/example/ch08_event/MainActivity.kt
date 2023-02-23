package com.example.ch08_event

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ch08_event.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var initTime =0L  //long 타입
    var pauseTime =0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)  //setContentView 사용할 때마다 초기화가 된다.

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            binding.chronometer.start()
            binding.stopButton.isEnabled = true
            binding.resetButton.isEnabled = true
            binding.resetButton.isEnabled = false
        }
        binding.stopButton.setOnClickListener {
            pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.stopButton.isEnabled = false
            binding.resetButton.isEnabled = true
            binding.startButton.isEnabled = true
        }
        binding.resetButton.setOnClickListener {
            pauseTime = 0L
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.startButton.isEnabled = false
            binding.resetButton.isEnabled = false
            binding.startButton.isEnabled = true
        }

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
        if (keyCode===KeyEvent.KEYCODE_BACK){
            if (System.currentTimeMillis() - initTime >3000){
                Toast.makeText(this, "종료하려면 한 번 더 누르세요!!",
                Toast.LENGTH_LONG).show()
                initTime = System.currentTimeMillis()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}
package com.example.checker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countNum = 0
        plus.setOnClickListener {
            Log.d("onClick","+버튼이 눌렸습니다.")

            countNum += 1
            count.text = countNum.toString()
        }
        reset.setOnClickListener {
            Log.d("onClick","리셋버튼이 눌렸습니다.")

            countNum = 0
            count.text = countNum.toString()
        }
    }
}
package com.valencio.squareloader

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.valencio.squareloaderanimation.SlidingSquareLoaderView

class MainActivity : AppCompatActivity() {
    lateinit var loaderView: SlidingSquareLoaderView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loaderView = findViewById(R.id.loader123)
        //loaderView.show()
        timerFunction()
    }

    private fun timerFunction() {
        object : CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                //call the squareLoader here.
                loaderView.show()
            }
        }.start()

    }
}


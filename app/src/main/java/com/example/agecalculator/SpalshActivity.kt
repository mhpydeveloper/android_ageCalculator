package com.example.agecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SpalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)
        var splashtime=object :Thread(){
            override fun run() {
                super.run()
                Thread.sleep(3000)
                startActivity(Intent(this@SpalshActivity,MainActivity::class.java))
            }
        }
        splashtime.start()
    }

    override fun onPause() {
        super.onPause()
        finish()

    }
}
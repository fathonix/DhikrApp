package com.idn.doadandzikir

import android.content.Intent
import android.os.Bundle
import android.os.Handler

import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Handler().postDelayed({
//            startActivity(Intent(this,MainActivity::class.java))
//            finish()
//        },3000)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
    }
}
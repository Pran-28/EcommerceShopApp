package com.example.ecommerceshopapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import com.example.ecommerceshopapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
         val splash_text = findViewById<TextView>(R.id.splash_text)

        Handler().postDelayed(
            {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish() // calling this when you are done changing activities
            }, 2500
        )

     //   val typeface : Typeface = Typeface.createFromAsset(assets, "RobotoBold.ttf")
      //  splash_text.typeface = typeface // Typeface is used to bring add external fonts to text another way is to create new custom class
    }
}
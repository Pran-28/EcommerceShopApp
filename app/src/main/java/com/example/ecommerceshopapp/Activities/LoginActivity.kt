package com.example.ecommerceshopapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import com.example.ecommerceshopapp.R

class LoginActivity : AppCompatActivity() {
    private lateinit var actionBar: ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



    }

    fun register_here(view: View) {

        val intent = Intent(applicationContext,RegisterActivity::class.java)
        startActivity(intent)
        finish()

    }
}
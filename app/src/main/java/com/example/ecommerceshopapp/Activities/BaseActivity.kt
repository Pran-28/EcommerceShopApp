package com.example.ecommerceshopapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import com.example.ecommerceshopapp.R
import com.google.android.material.snackbar.Snackbar

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    fun ErrorSnackBar(message: String, errorMessage: Boolean){

    }
}
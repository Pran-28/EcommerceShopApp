package com.example.ecommerceshopapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat.startActivity
import com.example.ecommerceshopapp.R

class RegisterActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        toolbar = findViewById(R.id.toolbar)

        SetupToolbar()


    }


    fun login_here(view: View) {
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun SetupToolbar() {
        // setting toolbar as action bar
        setSupportActionBar(toolbar)
        supportActionBar?.apply {

            // show back button on toolbar
            setDisplayHomeAsUpEnabled(true)

            // setting back button drawable
            setHomeAsUpIndicator(R.drawable.ic_back_arrow)


            // will go to start activity
            toolbar.setNavigationOnClickListener { onBackPressed() }
        }

    }
}








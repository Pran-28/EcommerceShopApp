package com.example.ecommerceshopapp.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class MSPTextView(  context: Context,   attrs : AttributeSet) : AppCompatTextView(context, attrs) {

    init {
        applyfont()
    }

    private fun applyfont() {
        var typeface = Typeface.createFromAsset(context.assets, "RobotoBold.ttf")
        setTypeface(typeface)
    }
}
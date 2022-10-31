package com.example.ecommerceshopapp.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class MSPEditText(context: Context, attrs:AttributeSet) : AppCompatEditText(context, attrs) {

    init {
        // call the function to apply to the components

        applyfont()
    }

    private fun applyfont() {
        val typeface = Typeface.createFromAsset(context.assets, "RobotoBold.ttf")
        setTypeface(typeface)
    }

}
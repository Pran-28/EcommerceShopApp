package com.example.ecommerceshopapp.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

// This class is used to make custom TextViews to add

class RobotoMonoTextBold(context: Context, attrs : AttributeSet) : AppCompatTextView(context, attrs) {
    init {
        // call the function to apply font to the components

        applyfonts()
    }

    private fun applyfonts() {

        val typeface = Typeface.createFromAsset(context.assets, "RobotoBold.ttf")
        setTypeface(typeface)
    }
}
package com.example.b3

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Button

import android.widget.TextView

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display: TextView = findViewById(R.id.display)
        val Symbol: String? = null
        val ac: TextView = findViewById(R.id.AC)
        val plus_or_minus: TextView = findViewById(R.id.plus_or_minus)
        val percent: TextView = findViewById(R.id.percent)
        val division: TextView = findViewById(R.id.division)
        val one: TextView = findViewById(R.id.one)
        val two: TextView = findViewById(R.id.two)
        val three: TextView = findViewById(R.id.three)
        val four: TextView = findViewById(R.id.four)
        val five: TextView = findViewById(R.id.five)
        val six: TextView = findViewById(R.id.six)
        val seven: TextView = findViewById(R.id.seven)
        val eight: TextView = findViewById(R.id.eight)
        val nine: TextView = findViewById(R.id.nine)
        val multi: TextView = findViewById(R.id.multi)
        val minus: TextView = findViewById(R.id.minus)
        val plus: TextView = findViewById(R.id.plus)
        val zero: TextView = findViewById(R.id.zero)
        val comma: TextView = findViewById(R.id.comma)

        ac.setOnClickListener { display.text = '0'.toString() }

        one.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "1"
//            else if(values.text.toString() )
            else display.text = display.text.toString() + "1"
        }
        two.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "2"
            else display.text = display.text.toString() + "2"
        }
        three.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "3"
            else display.text = display.text.toString() + "3"
        }
            four.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "4"
            else display.text = display.text.toString() + "4"
        }
        five.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "5"
            else display.text = display.text.toString() + "5"
        }
        six.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "6"
            else display.text = display.text.toString() + "6"
        }
        seven.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "7"
            else display.text = display.text.toString() + "7"
        }
        eight.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "8"
            else display.text = display.text.toString() + "8"
        }
        nine.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "9"
            else display.text = display.text.toString() + "9"
        }
        zero.setOnClickListener {
            if(display.text == '0'.toString()) display.text = "0"
            else display.text = display.text.toString() + "0"
        }

        fun TextView.OnClick(click: (values: String) -> Unit) {
            this.setOnTouchListener { _, motionEvent ->
                when (motionEvent.action) {
                    MotionEvent.ACTION_DOWN -> {
                        click(this.text.toString())
                        this.setBackgroundResource(R.drawable.border2)
                    }
                    MotionEvent.ACTION_UP -> {
                        this.setBackgroundResource(R.drawable.border)
                    }
                }
                true
            }
        }

        fun number() {
            zero.OnClick { values -> "0" }

            one.OnClick { values -> "1" }

            two.OnClick { values -> "2" }

            three.OnClick { values -> "3" }

            four.OnClick { values -> "4" }

            five.OnClick { values -> "5" }

            six.OnClick { values -> "6" }

            seven.OnClick { values -> "7" }

            eight.OnClick { values -> "8" }

            nine.OnClick { values -> "9" }
        }


        fun symbol() {
            plus.OnClick { values -> "+" }

            minus.OnClick { values -> "-" }

            multi.OnClick { values -> "*" }

            division.OnClick { values -> " / " }

            percent.OnClick { values -> " % " }

            comma.OnClick { values -> " . " }


        }


    }


}
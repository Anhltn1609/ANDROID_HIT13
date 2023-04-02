package com.example.b3

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Button

import android.widget.TextView
import kotlin.math.log

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity()  {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result: TextView = findViewById(R.id.result)
        val solution: TextView = findViewById(R.id.solution)
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
        val equals: TextView = findViewById(R.id.equals)
        ac.setOnClickListener { result.text = "0" }

        one.setOnClickListener {
            if(result.text == "0") result.text = "1"
//            else if(values.text.toString() )
            else result.text = result.text.toString() + "1"
        }
        two.setOnClickListener {
            if(result.text == "0") result.text = "2"
            else result.text = result.text.toString() + "2"
        }
        three.setOnClickListener {
            if(result.text == "0") result.text = "3"
            else result.text = result.text.toString() + "3"
        }
            four.setOnClickListener {
            if(result.text == "0") result.text = "4"
            else result.text = result.text.toString() + "4"
        }
        five.setOnClickListener {
            if(result.text == "0") result.text = "5"
            else result.text = result.text.toString() + "5"
        }
        six.setOnClickListener {
            if(result.text == "0") result.text = "6"
            else result.text = result.text.toString() + "6"
        }
        seven.setOnClickListener {
            if(result.text == "0") result.text = "7"
            else result.text = result.text.toString() + "7"
        }
        eight.setOnClickListener {
            if(result.text == "0") result.text = "8"
            else result.text = result.text.toString() + "8"
        }
        nine.setOnClickListener {
            if(result.text == "0") result.text = "9"
            else result.text = result.text.toString() + "9"
        }
        zero.setOnClickListener {
            if(result.text == "0") result.text = "0"
            else result.text = result.text.toString() + "0"
        }

        var fl_multi = false
        var fl_plus = false
        var fl_minus = false
        var fl_div = false
        multi.setOnClickListener {
            solution.text = result.text
            result.text = "0"
            fl_multi = true
            fl_plus = false
            fl_minus = false
            fl_div = false
        }
        plus.setOnClickListener {
            solution.text = result.text
            result.text = "0"
            fl_plus = true
            fl_multi = false
            fl_minus = false
            fl_div = false
        }
        minus.setOnClickListener {
            solution.text = result.text
            result.text = "0"
            fl_plus = false
            fl_multi = false
            fl_minus = true
            fl_div = false
        }
        division.setOnClickListener {
            solution.text = result.text
            result.text = "0"
            fl_plus = false
            fl_multi = false
            fl_minus = false
            fl_div = true
        }
        equals.setOnClickListener {
            if(fl_plus) result.text = (solution.text.toString().toFloat() + result.text.toString().toFloat()).toString()
            if(fl_minus) result.text = (solution.text.toString().toFloat() - result.text.toString().toFloat()).toString()
            if(fl_div) result.text = (solution.text.toString().toFloat() / result.text.toString().toFloat()).toString()
            if(fl_multi) result.text = (solution.text.toString().toFloat() * result.text.toString().toFloat()).toString()
        }
        plus_or_minus.setOnClickListener {
            if(result.text.toString().compareTo("-")== 1 ) {
                result.text =  result.text.subSequence(1,result.text.length)
            }else result.text = "-" +  result.text
        }
        percent.setOnClickListener {
            result.text =(result.text.toString().toFloat() / 100 ).toString()
        }
        comma.setOnClickListener {
            result.text = (result.text.toString() + ".")
        }
    }



}

package com.example.b3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val txt: TextView = findViewById(R.id.text_view_title)
//        val tt: TextView = findViewById(R.id.text_view_number)
//        val button: Button = findViewById(R.id.nhan)
//        var cnt: Int = 0;
//
//
//
//        Log.e("text", txt.text.toString())
//
//        txt.setOnClickListener{
//            txt.text = "World"
//            txt.setTextColor(resources.getColor(R.color.purple_200))
//            txt.setTextSize(200F)
//        }
//        button.setOnClickListener {
//            tt.setText(cnt++.toString())
//            Log.e("a", tt.text.toString())
//        }

        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)

        b2.setOnClickListener{
            b1.background = b2.background
            b1.text = b2.text
        }

        b3.setOnClickListener{
            b1.setBackgroundColor(Color.BLUE)
            b1.text = b3.text
        }

        b4.setOnClickListener{
            b1.background = b4.background
            b1.text = b4.text
        }
    }
}
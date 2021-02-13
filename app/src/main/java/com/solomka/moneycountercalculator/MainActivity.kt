package com.solomka.moneycountercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat
import kotlin.text.toInt as textToInt

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumClick()

    }

    private fun sumClick(){

        buttonTotal.setOnClickListener(){

            val mon200: Int = if (editText200.text.toString().isBlank()) 0 else (editText200.text.toString()).textToInt() * 200
            val mon100: Int = if (editText100.text.toString().isBlank()) 0 else(editText100.text.toString()).textToInt() * 100
            val mon50: Int = if (editText50.text.toString().isBlank()) 0 else(editText50.text.toString()).textToInt() * 50
            val mon20: Int = if (editText20.text.toString().isBlank()) 0 else(editText20.text.toString()).textToInt() * 20
            val mon10: Int = if (editText10.text.toString().isBlank()) 0 else(editText10.text.toString()).textToInt() * 10
            val mon5: Int = if (editText5.text.toString().isBlank()) 0 else(editText5.text.toString()).textToInt() * 5
            val mon2: Int = if (editText2.text.toString().isBlank()) 0 else(editText2.text.toString()).textToInt() * 2
            val mon1: Int = if (editText1.text.toString().isBlank()) 0 else(editText1.text.toString()).textToInt() * 1
            val mon05: Double = if (editText0_5.text.toString().isBlank()) 0.0 else (editText0_5.text.toString()).textToInt() * 0.5
            val mon02: Double = if (editText0_2.text.toString().isBlank()) 0.0 else(editText0_2.text.toString()).textToInt() * 0.2
            val mon01: Double = if (editText0_1.text.toString().isBlank()) 0.0 else(editText0_1.text.toString()).textToInt() * 0.1
            val mon005: Double = if (editText0_05.text.toString().isBlank()) 0.0 else(editText0_05.text.toString()).textToInt() * 0.05
            val mon002: Double = if (editText0_02.text.toString().isBlank()) 0.0 else(editText0_02.text.toString()).textToInt() * 0.02
            val mon001: Double = if (editText0_01.text.toString().isBlank()) 0.0 else(editText0_01.text.toString()).textToInt() * 0.01
            val semiTotal =(mon200 + mon100 + mon50 + mon20 + mon10 + mon5 +
                    mon2 + mon1 + mon05 + mon02 + mon01 + mon005 +
                    mon002 + mon001).toDouble().toString()
            //val total : String = "%.2f".format(semiTotal)
            textViewTotal.text = semiTotal
        }

    }
}


package com.solomka.moneycountercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.text.toInt as textToInt

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumClick()

    }

    private fun sumClick(){

        buttonTotal.setOnClickListener(){
            val mon200: Int = (editText200.text.toString()).textToInt() * 200
            val mon100: Int = (editText100.text.toString()).textToInt() * 100
            val mon50: Int = (editText50.text.toString()).textToInt() * 50
            val mon20: Int = (editText20.text.toString()).textToInt() * 20
            val mon10: Int = (editText10.text.toString()).textToInt() * 10
            val mon5: Int = (editText10.text.toString()).textToInt() * 5
            val mon2: Int = (editText2.text.toString()).textToInt() * 2
            val mon1: Int = (editText1.text.toString()).textToInt() * 1
            val mon05: Double = (editText0_5.text.toString()).textToInt() * 0.5
            val mon02: Double = (editText0_2.text.toString()).textToInt() * 0.2
            val mon01: Double = (editText0_1.text.toString()).textToInt() * 0.1
            val mon005: Double = (editText0_05.text.toString()).textToInt() * 0.05
            val mon002: Double = (editText0_02.text.toString()).textToInt() * 0.02
            val mon001: Double = (editText0_01.text.toString()).textToInt() * 0.01
            val total =(mon200 + mon100 + mon50 + mon20 + mon10 + mon5 +
                    mon2 + mon1 + mon05 + mon02 + mon01 + mon005 +
                    mon002 + mon001).toString()
            textViewTotal.text = total
        }

    }
}


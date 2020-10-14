package com.solomka.moneycountercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.text.toInt as textToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        summ_Click()

    }

    fun summ_Click(){
        buttonTotal.setOnClickListener(){
            var mon200: Int = (editText200.text.toString()).textToInt() * 200
            var mon100: Int = (editText100.text.toString()).textToInt() * 100
            var mon50: Int = (editText50.text.toString()).textToInt() * 50
            var mon20: Int = (editText20.text.toString()).textToInt() * 20
            var mon10: Int = (editText10.text.toString()).textToInt() * 10
            var mon5: Int = (editText10.text.toString()).textToInt() * 5
            var mon2: Int = (editText2.text.toString()).textToInt() * 2
            var mon1: Int = (editText1.text.toString()).textToInt() * 1
            var mon0_5: Double = (editText0_5.text.toString()).textToInt() * 0.5
            var mon0_2: Double = (editText0_2.text.toString()).textToInt() * 0.2
            var mon0_1: Double = (editText0_1.text.toString()).textToInt() * 0.1
            var mon0_05: Double = (editText0_05.text.toString()).textToInt() * 0.05
            var mon0_02: Double = (editText0_02.text.toString()).textToInt() * 0.02
            var mon0_01: Double = (editText0_01.text.toString()).textToInt() * 0.01
            var total: String =(mon200 + mon100 + mon50 + mon20 + mon10 + mon5 +
                    mon2 + mon1 + mon0_5 + mon0_2 + mon0_1 + mon0_05 +
                    mon0_02 + mon0_01).toString()
            textViewTotal.setText(total)
        }

    }
}


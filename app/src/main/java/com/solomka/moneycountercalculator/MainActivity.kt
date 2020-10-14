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

        val editText200  = findViewById<EditText>(R.id.editText200) as EditText

        //val num200 = editText200.text.toString().textToInt()

        var editText100 : Int  = (editText100.text.toString()).textToInt()
        var num100 :String = (editText100 * 100).toString()

        val editText50 = findViewById<EditText>(R.id.editText50)
        val editText20 = findViewById<EditText>(R.id.editText20)
        val editText10 = findViewById<EditText>(R.id.editText10)
        val editText5 = findViewById<EditText>(R.id.editText5)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText05 = findViewById<EditText>(R.id.editText0_5)
        val editText02 = findViewById<EditText>(R.id.editText0_2)
        val editText01 = findViewById<EditText>(R.id.editText0_1)
        val editText005 = findViewById<EditText>(R.id.editText0_05)
        val editText002 = findViewById<EditText>(R.id.editText0_02)
        val editText001 = findViewById<EditText>(R.id.editText0_01)

        buttonTotal.setOnClickListener {
            var totalMoney = num100
            Toast.makeText(this, editText200.text, Toast.LENGTH_SHORT).show()
            textViewTotal.text = totalMoney.toString()
        }
    }

}



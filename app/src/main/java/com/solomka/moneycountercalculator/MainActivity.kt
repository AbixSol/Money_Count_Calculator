package com.solomka.moneycountercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText200 = findViewById<EditText>(R.id.editText200)
        val editText100 = findViewById<EditText>(R.id.editText100)
        val editText50 = findViewById<EditText>(R.id.editText50)
        val editText20 = findViewById<EditText>(R.id.editText20)
        val editText10 = findViewById<EditText>(R.id.editText10)
        val editText5 = findViewById<EditText>(R.id.editText5)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText0_5 = findViewById<EditText>(R.id.editText0_5)
        val editText0_2 = findViewById<EditText>(R.id.editText0_2)
        val editText0_1 = findViewById<EditText>(R.id.editText0_1)
        val editText0_05 = findViewById<EditText>(R.id.editText0_05)
        val editText0_02 = findViewById<EditText>(R.id.editText0_02)
        val editText0_01 = findViewById<EditText>(R.id.editText0_01)

        val amount200 = editText200.text.toString().toInt()*200
    }
}

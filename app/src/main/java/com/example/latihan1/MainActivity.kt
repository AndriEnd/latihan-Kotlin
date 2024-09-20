package com.example.latihan1

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan1.R.id.edt_length

class MainActivity : Activity() {
    private lateinit var edtWidth: EditText
    private lateinit var edtHeigth: EditText
    private lateinit var edtlength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtHeigth = findViewById(R.id.edt_height)
        edtlength = findViewById(edt_length)
        edtWidth = findViewById(R.id.edt_width)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate.setOnClickListener {
            testing()
        }
    }
   public fun testing (){
       val inputLength = edtlength.text.toString().trim()
       val inputWidth = edtWidth.text.toString().trim()
       val inputHeight = edtHeigth.text.toString().trim()
        val volume = inputLength.toString().toInt() * inputWidth.toString().toInt() * inputHeight.toString().toInt()
        tvResult.text = volume.toString()
    }
}



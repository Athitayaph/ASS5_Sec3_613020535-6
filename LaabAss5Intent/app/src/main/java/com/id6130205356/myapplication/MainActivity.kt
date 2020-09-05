package com.id6130205356.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        var selectID = gender.checkedRadioButtonId
        var radioChecked = findViewById<RadioButton>(selectID)
        val intent = Intent( this, SecondActivity::class.java)
        intent.putExtra("empData", Employee(input_name.text.toString(), radioChecked.text.toString(), input_email.text.toString(), input_salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun Reset(v:View){
        input_name.text.clear()
        input_email.text.clear()
        input_salary.text.clear()
        gender.clearCheck()
    }
}
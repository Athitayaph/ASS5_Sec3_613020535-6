package com.id6130205356.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var EmpData = data?.getParcelable<Employee>("empData")
        nameEmp.text = "Employee Name :  ${EmpData?.name}"
        genderEmp.text = "Gender : ${EmpData?.gender}"
        emailEmp.text = "E-mail : ${EmpData?.email}"
        salaryEmp.text = "Salary : ${EmpData?.Salary} Baht"

    }
    fun onClickClose(view: View){
        finish()
    }
}
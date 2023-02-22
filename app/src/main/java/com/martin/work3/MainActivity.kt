package com.martin.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buclickEvent(view: View){

        val DOB = findViewById<EditText>(R.id.txt1)
        val showAge = findViewById<TextView>(R.id.txt2)

        val userDOB: String = DOB.text.toString()
        if (userDOB.toInt() == 0){
            showAge.text = "invalid input"
            return
        }
        val year: Int = Calendar.getInstance().get(Calendar.YEAR)
        //instance required to make a call to the member
        val myAge  = year - userDOB.toInt()
        val avg = myAge/userDOB.toInt()
        showAge.text = "Your age is $myAge" + " and average is $avg"

    }
}
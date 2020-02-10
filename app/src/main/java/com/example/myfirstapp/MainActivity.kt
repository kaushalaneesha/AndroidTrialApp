// Each new activity has its own layout and Java files,  
// here we build the logic for adding two number
package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // define the global variable

    // variable number1, number2 for input input number
    // Add_button, result textView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // by ID we can use each component which id is assign in xml file
        val number1 = findViewById<EditText>(R.id.editText_first_no)
        val number2 = findViewById<EditText>(R.id.editText_second_no)
        val addButton = findViewById<Button>(R.id.add_button)
        val result = findViewById<TextView>(R.id.textView_answer)

        // Add_button add clicklistener
        addButton.setOnClickListener {
            // num1 or num2 double type
            // get data which is in edittext, convert it to string
            // using parse Double convert it to Double type
            var num1 = 0.0
            if(number1.text.toString().isNotEmpty()) {
                num1 = number1.text.toString().toDouble()
            }
            var num2 = 0.0
            if(number2.text.toString().isNotEmpty()) {
                num2 = number2.text.toString().toDouble()
            }
            // add both number and store it to sum
            val sum = num1 + num2
            // set it ot result textview
            result.text = sum.toString()
        }
    }
} 
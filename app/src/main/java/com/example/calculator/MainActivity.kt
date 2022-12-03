package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.etNum1)
        val secondNumber = findViewById<EditText>(R.id.etNum2)

        val sumButton = findViewById<RadioButton>(R.id.rbSum)
        val diffButton = findViewById<RadioButton>(R.id.rbDifference)
        val multiButton = findViewById<RadioButton>(R.id.rbMultiplication)
        val divButton = findViewById<RadioButton>(R.id.rbDivision)

        val resultText = findViewById<TextView>(R.id.tvResult)

        val submitButton = findViewById<Button>(R.id.bSubmit)

        submitButton.setOnClickListener{
            val num1 = firstNumber.text.toString().toDouble()
            val num2 = secondNumber.text.toString().toDouble()

            if (sumButton.isChecked){
                val res = num1 + num2
                val message= "The sum of the numbers is $res"
                resultText.text = message
            }else if (diffButton.isChecked){
                val res = num1 - num2
                val message= "The difference of the numbers is $res"
                resultText.text = message
            }else if (multiButton.isChecked){
                val res = num1 * num2
                val message= "The product of the numbers is $res"
                resultText.text = message
            }else if (divButton.isChecked){
                val res = num1/num2
                val message= "The quotient of the numbers is $res"
                resultText.text = message
            }else {
                Toast.makeText( this@MainActivity, "Enter proper values", Toast.LENGTH_SHORT).show()
            }

        }


    }
}
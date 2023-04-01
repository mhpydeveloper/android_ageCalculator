package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var date: Calendar

    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        editText=findViewById(R.id.editTextNumber)
        date = Calendar.getInstance()
        button.setOnClickListener {
            if (editText.length()>0){
                var now = date.get(Calendar.YEAR)
                val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                var bd = editText.text.toString()
                var age = currentYear.toInt() - bd.toInt()
                textView.text = "سن شما  ${age}"

            }else {
                textView.text="لطفا عدد را وارد کنید"
            }

        }
    }

}

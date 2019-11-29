package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_heart_rate.*

class HeartRateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart_rate)


        button2.setOnClickListener {
            textView3.text = "Heart Rate: " + editText2.text.toString()
        }

        button4.setOnClickListener {
            val intentGoToMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentGoToMainActivity)
        }

    }
}

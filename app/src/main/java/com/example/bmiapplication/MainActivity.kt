package com.example.bmiapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnSendMoneyActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnSendMoneyActivity = findViewById(R.id.btnSendMoney)

        btnBmi.setOnClickListener {
            val intent =Intent(this,CalculateBMIActivity::class.java)
            startActivity(intent)
        }

        btnSendMoneyActivity.setOnClickListener {
            val intent=Intent(this,SendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}
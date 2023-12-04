package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OtpActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        val btnNext: Button = findViewById(R.id.btn_next)
        btnNext.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_next -> {
                val intent = Intent(this@OtpActivity, ForgetPasswordNewActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
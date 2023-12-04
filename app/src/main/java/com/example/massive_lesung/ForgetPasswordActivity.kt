package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class ForgetPasswordActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etemail: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        etemail = findViewById(R.id.edt_email)
        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val bundle = Bundle()
                bundle.putString("Email", etemail.text.toString())
                val intent = Intent(this@ForgetPasswordActivity, ForgetPasswordNewActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}
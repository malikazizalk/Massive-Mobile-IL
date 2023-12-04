package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SigninActivity: AppCompatActivity(), View.OnClickListener  {
    private lateinit var etemail: TextInputEditText
    private lateinit var etPassword:TextInputEditText
    private lateinit var sign1: TextView
    private lateinit var forget: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        etemail = findViewById(R.id.edt_email)
        etPassword = findViewById(R.id.edt_pass)
        sign1 = findViewById(R.id.SignUp1)
        forget = findViewById(R.id.edt_forget)


        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
        sign1.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val bundle = Bundle()
                bundle.putString("Email", etemail.text.toString())
                bundle.putString("Password", etPassword.text.toString())
                val intent = Intent(this@SigninActivity, ChoseRoleActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.SignUp1 -> {
                val intent = Intent(this@SigninActivity, SignupActivity::class.java)
                startActivity(intent)
            }
            R.id.edt_forget -> {
                val intent = Intent(this@SigninActivity, ForgetPasswordActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
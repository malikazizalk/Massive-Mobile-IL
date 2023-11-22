package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener  {
    private lateinit var etemail: EditText
    private lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etemail = findViewById(R.id.edt_email)
        etPassword = findViewById(R.id.edt_pass)

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val bundle = Bundle()
                bundle.putString("Email", etemail.text.toString())
                bundle.putString("Password", etPassword.text.toString())
                val intent = Intent(this@LoginActivity, HomepageGuruActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}
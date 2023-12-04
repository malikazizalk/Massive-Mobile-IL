package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class ForgetPasswordNewActivity : AppCompatActivity(),  View.OnClickListener {
    private lateinit var etcomfirm: TextInputEditText
    private lateinit var etpass: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password_new)
        etcomfirm = findViewById(R.id.comfirmpass)
        etpass = findViewById(R.id.newpass)
        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_login -> {
                val bundle = Bundle()
                bundle.putString("Email", etcomfirm.text.toString())
                bundle.putString("Email", etpass.text.toString())
                val intent = Intent(this@ForgetPasswordNewActivity, SigninActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}
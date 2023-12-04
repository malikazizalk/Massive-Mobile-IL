package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SignupActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername: TextInputEditText
    private lateinit var etemail:TextInputEditText
    private lateinit var etnohp:TextInputEditText
    private lateinit var etPassword:TextInputEditText
    private lateinit var etComfirmPassword:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        etUsername = findViewById(R.id.edt_nama)
        etemail = findViewById(R.id.edt_email)
        etPassword = findViewById(R.id.edt_pass)
        etnohp = findViewById(R.id.edt_number)
        etComfirmPassword = findViewById(R.id.edt_comfirmpass)

        val btnSignup1: Button = findViewById(R.id.btn_signup)
        btnSignup1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.SignUp1-> {

                val bundle = Bundle()
                bundle.putString("Username", etUsername.text.toString())
                bundle.putString("Email", etemail.text.toString())
                bundle.putString("No hp", etnohp.text.toString())
                bundle.putString("Password", etPassword.text.toString())
                bundle.putString("Konirmasi Password", etComfirmPassword.text.toString())


                val intent = Intent(this@SignupActivity, SigninActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }


    }
}
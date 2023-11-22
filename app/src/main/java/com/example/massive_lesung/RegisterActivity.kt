package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername: EditText
    private lateinit var etemail:EditText
    private lateinit var etnohp:EditText
    private lateinit var etPassword:EditText
    private lateinit var etComfirmPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.edt_nama)
        etemail = findViewById(R.id.edt_email)
        etPassword = findViewById(R.id.edt_pass)
        etnohp = findViewById(R.id.edt_nohp)
        etComfirmPassword = findViewById(R.id.edt_comfirm_pass)

        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_register -> {

                val bundle = Bundle()
                bundle.putString("Username", etUsername.text.toString())
                bundle.putString("Email", etemail.text.toString())
                bundle.putString("No hp", etnohp.text.toString())
                bundle.putString("Password", etPassword.text.toString())
                bundle.putString("Konirmasi Password", etComfirmPassword.text.toString())


                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }


    }
}
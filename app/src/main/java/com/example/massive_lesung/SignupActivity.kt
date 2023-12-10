package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.signin.setOnClickListener{
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }
        binding.btnsignup.setOnClickListener{
            val intent = Intent(this, ChoseRoleActivity::class.java)
            startActivity(intent)
        }

        binding.btnsignup.setOnClickListener{
            val fullnama = binding.edtnama.text.toString()
            val email = binding.edtemail.text.toString()
            val phone = binding.edtNumber.text.toString()
            val pass = binding.edtpass.text.toString()
            val cpass = binding.comfirmpass.text.toString()

            if (fullnama.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && pass.isNotEmpty() && cpass.isNotEmpty()){
                if (pass == cpass){

                    firebaseAuth.createUserWithEmailAndPassword( email, pass).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this, ChoseRoleActivity::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Empty fields is not allowed !", Toast.LENGTH_SHORT).show()
            }
        }

//        etUsername = findViewById(R.id.edtnama)
//        etemail = findViewById(R.id.edt_email)
//        etPassword = findViewById(R.id.edt_pass)
//        etnohp = findViewById(R.id.edt_number)
//        etComfirmPassword = findViewById(R.id.comfirmpass)

//        val btnSignup1: Button = findViewById(R.id.btnsignup)
//        btnSignup1.setOnClickListener(this)
//    }
//
//    override fun onClick(v: View) {
//        when(v.id){
//            R.id.btnsignup-> {
//
//                val bundle = Bundle()
////                bundle.putString("Username", etUsername.text.toString())
////                bundle.putString("Email", etemail.text.toString())
////                bundle.putString("No hp", etnohp.text.toString())
////                bundle.putString("Password", etPassword.text.toString())
////                bundle.putString("Konirmasi Password", etComfirmPassword.text.toString())
//
//
//                val intent = Intent(this@SignupActivity, SigninActivity::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }
//        }
//
//
    }
}
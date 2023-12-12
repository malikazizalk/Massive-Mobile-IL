package com.example.massive_lesung

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.databinding.ActivitySigninBinding
import com.google.firebase.auth.FirebaseAuth

class SigninActivity: AppCompatActivity()  {

    private lateinit var binding: ActivitySigninBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.signup.setOnClickListener{
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Log in")
        progressDialog.setMessage("Please wait...")

        binding.btnlogin.setOnClickListener{
            val email = binding.edtEmail.text.toString()
            val pass = binding.edtPass.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()){
                progressDialog.show()
                    firebaseAuth.signInWithEmailAndPassword( email, pass).addOnCompleteListener{
                        if (it.isSuccessful){
                            progressDialog.dismiss()
                            val intent = Intent(this, MainActivityGuru::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
            }else{
                Toast.makeText(this, "Input Email and Password !", Toast.LENGTH_SHORT).show()
            }
        }

    }
    override fun onStart() {
        super.onStart()

        val intent = Intent(this, MainActivityGuru::class.java)
        startActivity(intent)
    }

}
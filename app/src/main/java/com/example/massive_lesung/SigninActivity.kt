package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.databinding.ActivitySigninBinding
import com.google.firebase.auth.FirebaseAuth

class SigninActivity: AppCompatActivity()  {

    private lateinit var binding: ActivitySigninBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

    binding.signup.setOnClickListener{
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }

    }

}
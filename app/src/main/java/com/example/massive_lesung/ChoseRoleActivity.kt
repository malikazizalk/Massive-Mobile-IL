package com.example.massive_lesung

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.databinding.ActivityChoseRoleBinding
import com.google.firebase.auth.FirebaseAuth

class ChoseRoleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChoseRoleBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var grouprole: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoseRoleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        grouprole = findViewById(R.id.grouprole)

        binding.grouprole.setOnClickListener{

        }

    }
//    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.role_teacher -> {
//                val teacher = Intent(this@ChoseRoleActivity, LengkapiDokumenActivity::class.java)
//                startActivity(teacher)
//            }
//
//
//        }
//    }
}
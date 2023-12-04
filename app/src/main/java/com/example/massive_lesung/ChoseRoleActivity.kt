package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ChoseRoleActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_role)
        val btnStudent: Button = findViewById(R.id.roleStudent)
        btnStudent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.roleStudent -> {
                val intent = Intent(this@ChoseRoleActivity, LengkapiDokumenActivity::class.java)
                startActivity(intent)
            }


        }
    }
}
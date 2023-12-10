package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class ChoseRoleActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_role)
        val asTeacher: LinearLayout = findViewById(R.id.role_teacher)
        asTeacher.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.role_teacher -> {
                val teacher = Intent(this@ChoseRoleActivity, LengkapiDokumenActivity::class.java)
                startActivity(teacher)
            }


        }
    }
}
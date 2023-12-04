package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GuruProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru_profile)
        val btnEdit: Button = findViewById(R.id.btn_edit)
        btnEdit.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_edit -> {
                val intent = Intent(this@GuruProfileActivity, GuruEditProfileActivity::class.java)
                startActivity(intent)
            }


        }
    }
}
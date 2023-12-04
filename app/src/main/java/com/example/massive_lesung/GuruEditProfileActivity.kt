package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GuruEditProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru_edit_profile)
        val btnSimpan: Button = findViewById(R.id.simpan)
        btnSimpan.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.simpan -> {
                val intent = Intent(this@GuruEditProfileActivity, GuruProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
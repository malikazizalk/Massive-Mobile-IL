package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.ui.profil.ProfileFragment

class GuruEditProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru_edit_profile)
        val btnSimpan: Button = findViewById(R.id.simpan)
        btnSimpan.setOnClickListener(this)

        val btnback: Button = findViewById(R.id.back)
        btnback.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.simpan -> {
                val intent = Intent(this@GuruEditProfileActivity, ProfileFragment::class.java)
                startActivity(intent)
            }
            R.id.back -> {
                val intent = Intent(this@GuruEditProfileActivity, ProfileFragment::class.java)
                startActivity(intent)
            }
        }
        return
    }
}
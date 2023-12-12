package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.ui.profil.ProfileFragment

class LengkapiDokumenActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lengkapi_dokumen)
        val btnSubmit: Button = findViewById(R.id.submit)
        btnSubmit.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.submit -> {
                val intent = Intent(this@LengkapiDokumenActivity, ProfileFragment::class.java)
                startActivity(intent)
            }


        }
    }
}
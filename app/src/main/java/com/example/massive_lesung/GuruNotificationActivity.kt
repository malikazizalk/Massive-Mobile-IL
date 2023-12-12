package com.example.massive_lesung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.ui.profil.ProfileFragment

class GuruNotificationActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru_notification)

        val btnBack: Button = findViewById(R.id.back)
        btnBack.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> {
                val intent = Intent(this@GuruNotificationActivity, ProfileFragment::class.java)
                startActivity(intent)
            }


        }
        return
    }
}
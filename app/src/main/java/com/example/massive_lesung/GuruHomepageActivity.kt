package com.example.massive_lesung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GuruHomepageActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru_homepage)

        val btnNotif: Button = findViewById(R.id.btn_notif)
        btnNotif.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_notif -> {
                val intent = Intent(this@GuruHomepageActivity, GuruNotificationActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
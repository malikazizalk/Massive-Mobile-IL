package com.example.massive_lesung
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class ScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
        Handler().postDelayed({
            startActivity(Intent(this, SigninActivity::class.java))
            finish()
        }, 1000)

    }
}

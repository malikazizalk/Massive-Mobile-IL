package com.example.massive_lesung

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView

class LengkapiDokumenActivity : AppCompatActivity(){

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_lengkapi_dokumen)
//        val btnSubmit: Button = findViewById(R.id.btn_submit)
//        btnSubmit.setOnClickListener(this)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lengkapi_dokumen)

        val btnSubmit = findViewById<Button>(R.id.btn_submit_lengkapi_dokumen)
        btnSubmit.setOnClickListener{
            showDialog()
        }
    }

    private fun showDialog(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.getWindow()?.setBackgroundDrawable(getDrawable(R.drawable.chose_role))
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.popup_tsc)

        val message = dialog.findViewById<TextView>(R.id.txt_message_tsc)
        val buttonAgree = dialog.findViewById<Button>(R.id.btn_agree)
        val buttonDisgree = dialog.findViewById<Button>(R.id.btn_disgree)


        buttonDisgree.setOnClickListener {
            dialog.dismiss()

        }

        buttonAgree.setOnClickListener {
                val intent = Intent(this@LengkapiDokumenActivity, GuruHomepageActivity::class.java)
                startActivity(intent)

        }

        dialog.show()
    }
}
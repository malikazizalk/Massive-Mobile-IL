package com.example.massive_lesung

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.massive_lesung.databinding.ActivityChoseRoleBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ChoseRoleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChoseRoleBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var grouprole: LinearLayout
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChoseRoleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()

//        firebaseAuth.updateCurrentUser(
//        if (grouprole = null) {
//            val user = hashMapOf(
//                "userType" to "OrtuUser" // Default user type
//            )
//
//            val db = FirebaseFirestore.getInstance()
//            db.collection("users").document(grouprole.uid)
//                .set(user)
//                .addOnSuccessListener {
//                    // Informasi pengguna berhasil disimpan
//                }
//                .addOnFailureListener { e ->
//                    // Penanganan kesalahan
//                }
//        }
//        )


//    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.role_teacher -> {
//                val teacher = Intent(this@ChoseRoleActivity, LengkapiDokumenActivity::class.java)
//                startActivity(teacher)
//            }
//
//
//        }
//    }
    }
}
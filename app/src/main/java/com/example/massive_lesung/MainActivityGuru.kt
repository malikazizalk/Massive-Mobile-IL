package com.example.massive_lesung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.massive_lesung.databinding.ActivityMainGuruBinding
import com.example.massive_lesung.ui.home.HomeFragment
import com.example.massive_lesung.ui.pchats.ChatFragment
import com.example.massive_lesung.ui.profil.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivityGuru : AppCompatActivity() {

    private lateinit var binding: ActivityMainGuruBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainGuruBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        val navView: BottomNavigationView = binding.navView

        binding.navView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.nphome -> replaceFragment(HomeFragment())
                R.id.npchats -> replaceFragment(ChatFragment())
                R.id.npprofile -> replaceFragment(ProfileFragment())

                else ->{

                }
            }
            true
        }
    }
        private fun replaceFragment(fragment:Fragment) {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction ()
            fragmentTransaction.replace (R.id.frame_layout,fragment)
            fragmentTransaction.commit()
        }


//        val navController = findNavController(R.id.nav_host_fragment_activity_main_guru)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.nphome, R.id.npchats, R.id.npprofile
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)

}
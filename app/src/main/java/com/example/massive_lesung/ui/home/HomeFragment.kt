package com.example.massive_lesung.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.massive_lesung.GuruNotificationActivity
import com.example.massive_lesung.R
import com.example.massive_lesung.databinding.FragmentHomeGuruBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeGuruBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val dashboardViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//
//        _binding = FragmentHomeGuruBinding.inflate(inflater, container, false)
//        val root: View = binding.root

        val view = inflater.inflate(R.layout.fragment_home_guru, container, false)



        val buttonInFragment: Button = view.findViewById(R.id.btn_notif)
        buttonInFragment.setOnClickListener {
            // Handle button click here
            // Contoh: Memulai aktivitas dari fragment
            val intent = Intent(activity, GuruNotificationActivity::class.java)
            startActivity(intent)
        }

        return view
    }

//        val textView: TextView = binding.frameContainer
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
//        return view
//    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
    }

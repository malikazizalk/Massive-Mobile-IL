package com.example.massive_lesung.ui.profil

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.massive_lesung.GuruEditProfileActivity
import com.example.massive_lesung.GuruInformasiSayaActivity
import com.example.massive_lesung.GuruPengaturanMengajarActivity
import com.example.massive_lesung.R
import com.example.massive_lesung.databinding.FragmentProfileGuruBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class ProfileFragment : Fragment() {

    lateinit var fullname :TextView
    lateinit var phone : TextView

    lateinit var auth: FirebaseAuth
    private lateinit var firebaseUser: FirebaseUser

    private var _binding: FragmentProfileGuruBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @Suppress("UNREACHABLE_CODE")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view = inflater.inflate(R.layout.fragment_profile_guru, container, false)
        auth = FirebaseAuth.getInstance()
        firebaseUser = FirebaseAuth.getInstance().currentUser!!

        val buttonInFragment: Button = view.findViewById(R.id.editprofile)
        val buttoninfo: Button = view.findViewById(R.id.informasi)
        val buttonatur: Button = view.findViewById(R.id.setStud)
        buttonInFragment.setOnClickListener{
            val intent = Intent(requireContext(), GuruEditProfileActivity::class.java)
            startActivity(intent)
        }
        buttoninfo.setOnClickListener{
            val intent = Intent(requireContext(), GuruInformasiSayaActivity::class.java)
            startActivity(intent)
        }
        buttonatur.setOnClickListener {
            val intent = Intent(requireContext(), GuruPengaturanMengajarActivity::class.java)
            startActivity(intent)
        }
        return view


        



        val profileViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentProfileGuruBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textNotifications
//        profileViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
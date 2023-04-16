package com.example.btvn5

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.btvn5.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy {FragmentHomeBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        binding.logout.setOnClickListener{
////            startActivity(Intent(this, MainActivity::class.java))
//            startActivity(Intent(this, MainActivity::class.java))
//
//        }




        return inflater.inflate(R.layout.fragment_home_, container, false)
    }
}
package com.example.btvn5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.btvn5.databinding.ActivityMainBinding
import com.example.btvn5.databinding.ActivityNavigationActivityrBinding

class NavigationActivityr : AppCompatActivity() {

    private val binding by lazy {ActivityNavigationActivityrBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(binding.fragmentTop.id , HomeFragment())
            .addToBackStack("home_frag").commit()

        binding.fragmentGift.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentTop.id , GiftFragment())
                .addToBackStack("gift_frag").commit()
        }

        binding.fragmentCart.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentTop.id , CartFragment() )
                .addToBackStack("cart-frag").commit()
        }

        binding.fragmentSetting.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentTop.id , SettingFragment() )
                .addToBackStack("setting-frag").commit()
        }

    }
}
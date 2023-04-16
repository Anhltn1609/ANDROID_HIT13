package com.example.btvn5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.btvn5.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    private val homeFragment by lazy { HomeFragment()}
    private val giftFragment by lazy { GiftFragment()}
    private val cartFragment by lazy { CartFragment()}
    private val settingFragment by lazy { SettingFragment()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_top,homeFragment).commit()
        binding.navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_top, homeFragment).commit()
                R.id.navigation_cart -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_top, cartFragment).commit()
                R.id.navigation_gift -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_top, giftFragment).commit()
                R.id.navigation_setting -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_top, settingFragment).commit()
                else -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_top, homeFragment).commit()
            }
            true;
        }

    }
}
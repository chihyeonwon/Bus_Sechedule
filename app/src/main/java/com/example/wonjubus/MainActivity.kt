package com.example.wonjubus

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.wonjubus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initViewPager()
        initNavigation()
    }

    private fun initViewPager() {
        val viewPager = binding.viewPager
        val viewPagerAdapter = ViewPagerAdapter(this)
        // pager에 adapter 연결
        viewPager.adapter = viewPagerAdapter

        // ViewPager로 슬라이드 시 BottomNavigation도 페이지로 활성화
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.bottomNavigation.menu.getItem(position).isChecked = true
            }
        })
    }

    private fun initNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bookmark -> {
                    binding.viewPager.currentItem = 0
                    return@setOnItemSelectedListener true
                }
                R.id.bus -> {
                    binding.viewPager.currentItem = 1
                    return@setOnItemSelectedListener true
                }
                R.id.stop -> {
                    binding.viewPager.currentItem = 2
                    return@setOnItemSelectedListener true
                }
                R.id.map -> {
                    binding.viewPager.currentItem = 3
                    return@setOnItemSelectedListener true
                }
                else -> {
                    binding.viewPager.currentItem = 4
                    return@setOnItemSelectedListener false
                }
            }
        }
    }
}
package com.example.wonjubus

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.wonjubus.fragments.BookmarkFragment
import com.example.wonjubus.fragments.BusFragment
import com.example.wonjubus.fragments.MapFragment
import com.example.wonjubus.fragments.StopFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    val fragments = listOf<Fragment>(BookmarkFragment(), BusFragment(), MapFragment(), StopFragment())

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}
package com.example.wonjubus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wonjubus.R
import com.example.wonjubus.databinding.FragmentBusBinding

// 버스 번호로 노선 검색 페이지
class BusFragment : Fragment() {
    private var _binding: FragmentBusBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBusBinding.inflate(inflater, container, false)
        return binding.root
    }
}
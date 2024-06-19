package com.example.wonjubus.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.lifecycle.lifecycleScope
import com.example.wonjubus.data.BusData

import com.example.wonjubus.databinding.FragmentBusBinding
import com.example.wonjubus.repository.BusRepository
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

// 버스 번호로 노선 검색 페이지
class BusFragment : Fragment() {
    private var _binding: FragmentBusBinding? = null
    private val binding get() = _binding!!

    private var routeNo by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBusBinding.inflate(inflater, container, false)

        lifecycleScope.launch {
            val data = BusRepository().getBus()
            Log.d("BusRepository","BusRepository: ${data}")
        }

        with(binding) {
            val detailList = arguments?.getParcelable<BusData>("bus_data")?.let {

            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}
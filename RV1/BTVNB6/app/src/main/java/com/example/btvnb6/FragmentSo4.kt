package com.example.btvnb6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.btvnb6.databinding.FragmentSo4Binding


class FragmentSo4 : Fragment() {
    private var _binding: FragmentSo4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSo4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Nút Back -> Quay lại Login
        binding.btnBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        // Nút Send code -> Sang màn OTP (So5)
        binding.btnSend.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.FragmentMain, FragmentSo5())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
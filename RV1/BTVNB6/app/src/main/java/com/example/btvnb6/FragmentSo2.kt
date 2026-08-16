package com.example.btvnb6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.btvnb6.databinding.FragmentSo2Binding

class FragmentSo2 : Fragment() {
    private var _binding: FragmentSo2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSo2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvForgot.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.FragmentMain, FragmentSo4())
                .addToBackStack(null)
                .commit()
        }

        binding.tvSignup.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.FragmentMain, FragmentSo3())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
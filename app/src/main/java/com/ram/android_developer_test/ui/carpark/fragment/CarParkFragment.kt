package com.ram.android_developer_test.ui.carpark.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ram.android_developer_test.databinding.FragmentCarparkBinding

class CarParkFragment: Fragment() {

    lateinit var binding: FragmentCarparkBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarparkBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    interface CarParkListener {
        fun onChooseOption()
    }
}
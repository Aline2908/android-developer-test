package com.ram.android_developer_test.ui.carpark.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ram.android_developer_test.databinding.FragmentRegistryBinding

class CarParkRegistryFragment: Fragment() {

    lateinit var binding: FragmentRegistryBinding

    private var listener: CarParkRegistryListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? CarParkRegistryListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistryBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    interface CarParkRegistryListener {
        fun onChooseEnterOrExit()
    }
}